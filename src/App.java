

public class App {
    public static void main(String[] args) throws Exception {
        String id="1zerotwozero3";
        System.out.println(solution(id));
    }
    public static int solution(String s) {
        int answer = 0;
        try {
            answer=Integer.parseInt(s);
        } catch (Exception e) {
            char[] arr=s.toCharArray();
            int len =arr.length; 
            String nums="";    
            String num="";     
            for(int i=0;i<len;i++){
               // System.out.println(arr[i]);
                if(arr[i]>=97&&arr[i]<=122){
                    num=num+arr[i];
                    switch (num) {
                        case "zero":
                        nums=nums+0;
                        num="";
                        break;
                        case "one":
                            nums=nums+1;
                            num="";
                            break;
                        case "two":
                            nums=nums+2;
                            num="";
                            break;
                        case "three":
                            nums=nums+3;
                            num="";
                            break;
                        case "four":
                            nums=nums+4;
                            num="";
                            break;
                        case "five":
                            nums=nums+5;
                            num="";
                            break;
                        case "six":
                            nums=nums+6;
                            num="";
                            break;
                        case "seven":
                            nums=nums+7;
                            num="";
                            break;
                        case "eight":
                            nums=nums+8;
                            num="";
                            break;
                        case "nine":
                            nums=nums+9;
                            num="";
                            break;
                        default:
                            break;
                    }
                }else{
                    nums=nums+arr[i];
                }
            }
            answer=Integer.parseInt(nums);
        }
        return answer;
    }
    
    
}
