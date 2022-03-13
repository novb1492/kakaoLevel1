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
            String arr1Two=tenToTwo(arr1[i]);
            String arr2Two=tenToTwo(arr2[i]);
            if(arr1Two.length()<n){
                int minus=n-arr1Two.length();
                for(int ii=0;ii<minus;ii++){
                    arr1Two="0"+arr1Two;
                }
            }
            if(arr2Two.length()<n){
                int minus=n-arr2Two.length();
                for(int ii=0;ii<minus;ii++){
                    arr2Two="0"+arr2Two;
                }
            }
            System.out.println(arr1Two);
            System.out.println(arr2Two);
            char[] arr1Chars=arr1Two.toCharArray();
            char[] arr2Chars=arr2Two.toCharArray();
            for(char arr1Char:arr1Chars){
                for(char arr2Char:arr2Chars){
                    if(arr1Char!=arr2Char){
                        
                    }
                }
            }
        }
        System.out.println(arr1AndArr2.toString());
        return answer;
    }
    private static String tenToTwo(int num) {
        return Integer.toBinaryString(num);
    }
    
    
    
}
