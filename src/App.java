import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String id="=.=";//...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(id));
    }
    public static String solution(String new_id) {
        String answer = new_id.toLowerCase();
        for(int i=0;i<=5;i++){
            if(i==0){
                for(char spelling:answer.toCharArray()){
                    int ascode=(int)spelling;
                    if((ascode>=48&&ascode<=57)||ascode==45||ascode==95||ascode==46||(ascode>=97&&ascode<=122)){
                        continue;

                    }else{
                        String a=""+spelling;
                        answer=answer.replace(a,"");
                    }
                }
                //System.out.println(answer);
            }else if(i==1){
                char[] arr=answer.toCharArray();
                int len=arr.length;
                for(int ii=0;ii<len;ii++){
                    int ascode=(int)arr[ii];
                    if(ii==len-1){
                        break;
                    }else if(ascode==46&&arr[ii+1]==46){
                        arr[ii]='#';
                        continue;

                    }
                }
                answer=new String(arr).replace("#", "");
                arr=answer.toCharArray();
                if(arr[0]==46){
                    arr[0]='#';
                }
                if(arr[arr.length-1]==46){
                    arr[arr.length-1]='#';
                }
                answer=new String(arr).replace("#", "");
               // System.out.println(answer);
            }else if(i==2){
                if(answer.isBlank()){
                    answer="a";
                }
                if(answer.length()>=16){
                    answer=answer.substring(0, 15);
                    char[] arr=answer.toCharArray();
                    if(arr[arr.length-1]==46){
                        arr[arr.length-1]='#';
                    }
                    answer=new String(arr).replace("#", "");
                }else if(answer.length()<=2){
                   char[] arr=answer.toCharArray();
                   while(true){
                       answer=answer+arr[arr.length-1];
                       if(answer.length()>=3){
                        break;
                       }
                   }
                }
            }
        }
        //System.out.println(new_id.toLowerCase());
        return answer;
    }
    
}
