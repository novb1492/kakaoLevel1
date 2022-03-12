import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] board={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[]moves={1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves));
    }
    public static int solution(int[][] board, int[] moves) {
        //아 알겟따 0은 비워져 있는거야 
        int answer = 0;
        Stack<Integer>carts=new Stack<>();
        carts.push(0);
       for(int move:moves){
            int num=0;
            int[] line=board[move-1];
           // System.out.println(move);
           // System.out.println(Arrays.toString(line));
            for(int i=line.length-1;i>0;i--){
               // System.out.println("i:"+i);
                num=line[i];
                //System.out.println("num:"+num);
                if(num!=0){
                    board[move-1][i]=0;
                    break;
                }
            }
            if(num!=0){
                System.out.println(num);
                if(carts.peek()==num){
                    answer+=1;
                    carts.pop();
                }else{
                    carts.push(num);
                }
            }
        }
        //15351214
        //01130302

        
        
        return answer*2;
    }
    
    
}
