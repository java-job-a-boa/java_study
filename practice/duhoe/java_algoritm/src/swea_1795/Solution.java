package swea_1795;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class Solution {
    static int T, N, M, X, x, y, c, graph1[][], graph2[][], shortcut1[], shortcut2[];

    public static void bfs(Queue<Integer> queue, int[][] g, int[] s){
        while (!queue.isEmpty()){
            int now = queue.poll();
            for (int next = 1; next < N+1; next++){
                if (g[now][next]!=0 && g[now][next] + s[now] < s[next]){
                    s[next] = s[now] + g[now][next];
                    queue.offer(next);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        System.setIn(new FileInputStream("./input_data/1795/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> Q = new LinkedList<Integer>();

        T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case < T+1; test_case++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());

            graph1 = new int[N+1][N+1];
            graph2 = new int[N+1][N+1];

            for (int i = 0; i < M; i++){
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                c = Integer.parseInt(st.nextToken());

                graph1[y][x] = c;
                graph2[x][y] = c;
            }

            shortcut1 = new int[N+1];
            shortcut2 = new int[N+1];
            for (int i = 0; i < N+1; i++){
                shortcut1[i] = 978654321;
                shortcut2[i] = 987654321;
            }

            shortcut1[X] = 0;
            shortcut2[X] = 0;

            Q.offer(X);
            bfs(Q, graph1, shortcut1);
            Q.offer(X);
            bfs(Q, graph2, shortcut2);

            int result = 0;
            for (int i = 1; i < N+1; i++){
                if (i==X) continue;
                if (shortcut1[i]+shortcut2[i] > result){
                    result = shortcut2[i] + shortcut1[i];
                }
            }
            System.out.println("#" + test_case + " " + result);
        }
    }
}