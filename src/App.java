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
        String dartResult="1S2D*3T";
        System.out.println(solution(dartResult));
    }
    public static int solution(String dartResult) {
        int answer = 0;
        char[] dartResults=dartResult.toCharArray();
        int len=dartResults.length;
        Map<Integer,String>dartResultArr=new HashMap<>();
        int key=0;
        int count=0;
        String sp="";
        for(int i=0;i<len;i++){
            count+=1;
            if(count==3){
                if(dartResults[i]!='*'&&dartResults[i]!='#'){
                    dartResultArr.put(key, sp);
                    i=i-1;
                }else{
                    sp=sp+dartResults[i];
                    dartResultArr.put(key, sp);
                }
                key+=1;
                sp="";
                count=0;
            }else{
                sp=sp+dartResults[i];
            }
        }
        System.out.println(dartResultArr.toString());
        return answer;
    }
    
    
    
}
