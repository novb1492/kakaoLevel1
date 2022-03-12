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
        int answer = 0;
        Stack<Integer>carts=new Stack<>();
        for(int move:moves){
            int num=0;
            for(int i=0;i<board.length;i++){
                num=board[i][move-1];
                if(num!=0){
                    board[i][move-1]=0;
                    break;
                }
            }
            if(num!=0){
                try {
                    int beforeNum=carts.peek();
                    if(beforeNum==num){
                        answer+=2;
                        carts.pop();
                    }else{
                        carts.push(num);
                    }
                } catch (Exception e) {
                   carts.push(num);
                }
            }
           
        }
        System.out.println(carts.toString());
        //15351214
        //01130302

        
        
        return answer;
    }
    
    
}
