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
        String[] dartResult={"1D2S0T","1S*2T*3S"};
        for( String s:dartResult){
            System.out.println(solution(s));
        }
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
            if(dartResults[i]=='*'||dartResults[i]=='#'){
                sp=sp+dartResults[i];
                dartResultArr.put(key,sp);
                count=0;
            }else{
                i=i-1;
                count=-1;
            }
            key+=1;
            sp="";
           }else{
               sp=sp+dartResults[i];
               dartResultArr.put(key,sp);
           }
            
        }
        System.out.println(dartResultArr.toString());
        for(int i=0;i<len;i++){
            String set=dartResultArr.get(i);
            if(set!=null){
                System.out.println(set);
                char[] sets=set.toCharArray();
                int num=Character.getNumericValue(sets[0]);
                char action=sets[1];
                char bounus='+';
                if(sets.length==3){
                    bounus=sets[2];
                } 
                int result=0;
                switch (action) {
                    case 'S':
                    result=(int) Math.pow(num,1);
                        break;
                    case 'D':
                    result=(int) Math.pow(num,2);
                        break;
                    case 'T':
                    result=(int) Math.pow(num,3);
                        break;
                    default:
                        break;
                }
                if(bounus!='+'){
                    if(bounus=='#'){
                        result=result*-1;
                    }else{
                        result=result*2;
                        if(i>0){
                            int beforeNum=Integer.parseInt(dartResultArr.get(i-1));
                            beforeNum=beforeNum*2;
                            dartResultArr.put(i-1, Integer.toString(beforeNum));
                        }
                    }
                    dartResultArr.put(i, Integer.toString(result));
                }else{
                    dartResultArr.put(i, Integer.toString(result));
                }
            }
        }
        System.out.println(dartResultArr.toString());
        for(Entry<Integer, String> s:dartResultArr.entrySet()){
            answer=answer+Integer.parseInt(s.getValue());
        }
        return answer;
    }

    
    
    
}
