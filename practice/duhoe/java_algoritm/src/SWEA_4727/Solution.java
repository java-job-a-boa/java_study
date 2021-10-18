package SWEA_4727;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

class node{
    int i, j, is_used, time;
    public node(int i, int j, int is_used, int time){
        this.i = i;
        this.j = j;
        this.is_used = is_used;
        this.time = time;
    }
}
public class Solution {
    static int T, N, M, mat[][], shortcut[][][];
    static int[] di = {-1, 1, 0, 0};
    static int[] dj = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("./input_data/4727/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<node> Q = new LinkedList<node>();

        T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case < T+1; test_case++){

            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            mat = new int[N][N];
            shortcut = new int[2][N][N];

            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    shortcut[0][i][j] = 987654321;
                    shortcut[1][i][j] = 987654321;
                }
            }

            shortcut[0][0][0] = 0;
            shortcut[1][0][0] = 0;

            for (int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++){
                    mat[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            Q.offer(new node(0, 0, 0, 0));

            while (!Q.isEmpty()){
                node n = Q.poll();

                for (int d = 0; d < 4; d++){
                    int ni = n.i + di[d];
                    int nj = n.j + dj[d];

                    if (0 <= ni && ni < N && 0 <= nj && nj < N){
                        int next_time = shortcut[n.is_used][ni][nj];
                        int next_used = n.is_used;

                        if (mat[ni][nj] != 1 && mat[n.i][n.j] != 1) continue;

                        if (mat[ni][nj] != 0){
                            next_time = n.time + (mat[ni][nj] - n.time % mat[ni][nj]);
                        }

                        else if (n.is_used == 0 && mat[ni][nj] == 0){
                            next_time = n.time + (M - n.time % M);
                            next_used = 1;
                        }

                        if (next_time < shortcut[n.is_used][ni][nj]){
                            shortcut[n.is_used][ni][nj] = next_time;
                            Q.offer(new node(ni, nj, next_used, next_time));
                        }
                    }
                }
            }

            System.out.println("#" + test_case + " " + Math.min(shortcut[0][N-1][N-1],shortcut[1][N-1][N-1]));
        }
    }
}
