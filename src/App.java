import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String id="...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(id));
    }
    public static String solution(String new_id) {
        String answer = new_id.toLowerCase();
        List<int[]>point=new ArrayList<>();
        for(int i=0;i<=5;i++){
            if(i==0){
                for(char spelling:answer.toCharArray()){
                    int ascode=(int)spelling;
                    if((ascode>=48&&ascode<=57)||ascode==45||ascode==95||ascode==46||(ascode>=97&&ascode<=122)){
                        System.out.println(spelling);
                        continue;

                    }else{
                        String a=""+spelling;
                        answer=answer.replace(a,"");
                    }
                }
            }else if(i==1){
                for(char spelling:answer.toCharArray()){
                    int ascode=(int)spelling;
                    if(ascode=){
                        System.out.println(spelling);
                        continue;

                    }else{
                        String a=""+spelling;
                        answer=answer.replace(a,"");
                    }
                }
            }
        }
        //System.out.println(new_id.toLowerCase());
        return answer;
    }
}
