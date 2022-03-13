import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) throws Exception {
        int n=5;
        int[] arr1={9, 20, 28, 18, 11};
        int[] arr2={30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(n,arr1,arr2)));
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Map<Integer,String>arr1AndArr2=new HashMap<>();
        for(int i=0;i<n;i++){
            String two=tenToTwo(arr1[i]);
            arr1AndArr2.put(i, two);
            two=tenToTwo(arr2[i]);
            String before=arr1AndArr2.get(i);
            arr1AndArr2.replace(i,before+","+two);
        }
        System.out.println(arr1AndArr2.toString());
        return answer;
    }
    private static String tenToTwo(int num) {
        return Integer.toString(num);
    }
    
    
}
