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
        System.out.println(solution("Wed",2));
    }
    public static String solution(String S,int K) {
        String answer = null;
        String[]arr={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        int ii=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(S)){
                ii=i;
                answer=arr[i];
                break;
            }
        }
        for(int i=0;i<K;i++){
            ii+=1;
            if(ii>=arr.length){
                ii=0;
                answer=arr[ii];
            }else{
                answer=arr[ii];   
            }
        }
        return answer;
    }
    
    
    
}
