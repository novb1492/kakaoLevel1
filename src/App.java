import java.util.Arrays;
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
        Map<String,String>xy=new HashMap<>();
        int x=0;
        int y=0;
        for(int i=1;i<=12;i++){
            String num=Integer.toString(i);
            if(num.equals("10")){
                num="*";
            }else if(num.equals("11")){
                num="0";
            }else if(num.equals("12")){
                num="#";
            }
            xy.put(num, x+","+y);
            if(i%3==0){
                y+=1;
                x=0;
            }else{
                x+=1;
            }
        }
        System.out.println(xy.toString());
        Map<String,String>useingHandAndNum=new HashMap<>();
        useingHandAndNum.put("L", "*");
        useingHandAndNum.put("R", "#");
        for(int num:numbers){
            if(num==1||num==4||num==7){
                answer=answer+"L";
                useingHandAndNum.replace("L", Integer.toString(num));
            }else if(num==3||num==6||num==9){
                answer=answer+"R";
                useingHandAndNum.replace("R", Integer.toString(num));
            }else{
                String[] leftXY=xy.get(useingHandAndNum.get("L")).split(",");
                String[] rightXY=xy.get(useingHandAndNum.get("R")).split(",");
                String[] numXY=xy.get(Integer.toString(num)).split(",");
                int numx=Integer.parseInt(numXY[0]);
                int numy=Integer.parseInt(numXY[1]);
                int leftx=Integer.parseInt(leftXY[0]);
                int lefty=Integer.parseInt(leftXY[1]);
                int rightx=Integer.parseInt(rightXY[0]);
                int righty=Integer.parseInt(rightXY[1]);
                int minusLeftX=Math.abs(numx-leftx);
                int minusLeftY=Math.abs(numy-lefty);
                int minusRightX=Math.abs(numx-rightx);
                int minusRightY=Math.abs(numy-righty);
                int leftTotal=minusLeftX+minusLeftY;
                int rightTotal=minusRightX+minusRightY;
                if(leftTotal==rightTotal){
                    if(hand.equals("right")){
                        answer=answer+"R";
                        useingHandAndNum.replace("R", Integer.toString(num));
                    }else{
                        answer=answer+"L";
                        useingHandAndNum.replace("L", Integer.toString(num));
                    }
                }else if(leftTotal<rightTotal){
                    answer=answer+"L";
                    useingHandAndNum.replace("L", Integer.toString(num));
                }else{
                    answer=answer+"R";
                    useingHandAndNum.replace("R", Integer.toString(num));
                }
            }
        }
        
        return answer;
    }
    
    
}
