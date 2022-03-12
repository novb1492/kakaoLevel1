import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand="right";
        System.out.println(solution(numbers,hand));
    }
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        String usingHand="";
        Map<String,Integer>useingHandAndNum=new HashMap<>();
        for(int num:numbers){
            if(num==1||num==4||num==7){
                answer=answer+"L";
                useingHandAndNum.put("L", num);
            }else if(num==3||num==6||num==9){
                answer=answer+"R";
                useingHandAndNum.put("R", num);
            }else{
                answer=answer+"m";
            }
        }
        return answer;
    }
    
    
}
