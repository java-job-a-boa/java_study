package boj_15596;

public class Test {
    // 'a라는 이름의 int형 배열' 을 매개변수로 입력받는 sum 함수를 작성 (이때, 반환되는 값은 long형)
    static long sum(int[] a){
        long ans = 0;
        for (int i = 0; i < a.length; i++)
        {
            ans += a[i];
        }
        return ans;
    }
    public static void main(String[] args){
        long result;
        int[] a = {1, 2, 3};

        result = sum(a);
        System.out.println(result);
    }
}
