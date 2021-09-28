package array;

public class Arratcopy {
    public static void main(String[] args){
        int[] num1 = {10, 20, 30, 40, 50};
        int[] num2 = new int[5];

        System.arraycopy(num1, 0, num2, 0, 5);
        for (int i=0; i<num2.length; i++){
            System.out.println(num2[i]);
        }
        for (int i : num2){
            System.out.println("향상된 for문: " + i);
        }
    }
}
