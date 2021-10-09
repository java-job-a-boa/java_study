package swea_2047;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception{

        System.setIn(new FileInputStream("./input_data/2047/input.txt"));

        Scanner sc = new Scanner(System.in);
        String sentance = sc.nextLine();
        sentance = sentance.toUpperCase();
        System.out.println(sentance);
    }
}
