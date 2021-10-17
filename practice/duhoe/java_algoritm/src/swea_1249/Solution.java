package swea_1249;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int N, mat[][], shortcut[][];
    static int r, c;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("./input_data/1249/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<node> Q = new LinkedList<node>();     // 큐를 링크드리스트로 구현, 들어갈 데이터 타입을 node로 한정

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T+1; test_case++){

            N = Integer.parseInt(br.readLine());
            mat = new int[N][N];
            shortcut = new int[N][N];

            for(int i = 0; i < N; i++){
                String s = br.readLine();
                for (int j = 0; j < N; j++) {
                    mat[i][j] = s.charAt(j)-'0';            // 숫자가 공백없이 붙어서 들어오므로, 한글자씩 변환
                    shortcut[i][j] = 987654321;
                }
            }

            shortcut[0][0] = 0;
            Q.offer(new node(0, 0));                    // 시작 좌표로 node 생성 및 큐에 담기

            while (!Q.isEmpty()){
                node n = Q.poll();
                r = n.i;
                c= n.j;

                for (int d = 0; d < 4; d++){
                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    if (0 <= nr && nr < N && 0 <= nc && nc < N && shortcut[nr][nc] > mat[nr][nc] + shortcut[r][c]){
                        shortcut[nr][nc] = mat[nr][nc] + shortcut[r][c];
                        Q.offer(new node(nr, nc));
                    }
                }
            }
            System.out.println("#"+test_case+" "+shortcut[N-1][N-1]);
        }
    }
}

// Generics 에 사용할 클래스 생성
class node{
    int i, j;

    // 생성자
    public node(int i, int j){
        this.i = i;
        this.j = j;
    }
}