package com.company;

public class arr_practice {

    public static void main(String[] args) {
	    int[] num = new int[10];
        int total = 0;

        for (int i = 0; i < num.length; i++){
            num[i] = i+1;
            total += num[i];
            System.out.println(num[i]);
        }
        System.out.println(total);
    }
}
