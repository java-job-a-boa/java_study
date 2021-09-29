package arrayList;
import java.util.ArrayList;

public class AL {
    public static void  main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i <5; i++){
            arr.add(i+1);
            System.out.println(arr.get(i) +", "+ arr.size());

        }
    }
}
