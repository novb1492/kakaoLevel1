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
       for(int move:moves){
            int[] line=board[move-1];
            System.out.println(move);
            System.out.println(Arrays.toString(line));
            for(int i=line.length-1;i>0;i--){
                int num=line[i];
                System.out.println("num:"+num);
                if(num!=0){
                    carts.push(num);
                    board[move-1][i]=0;
                    break;
                }
            }
        }
        //15351214
        //01130302
        System.out.println(carts.toString());
        int beforeNum=0;
        while(true){
           if(carts.empty()){
               break;
           }
           int nowNum=carts.peek();
           if(beforeNum==nowNum){
               answer+=1;
           }
           beforeNum=carts.peek();
           carts.pop();
        }
        System.out.println(carts.toString());
        return answer*2;
    }
    
    
}
