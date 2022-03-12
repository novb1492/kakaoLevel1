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
        System.out.println(Arrays.toString(board[3]));
       for(int move:moves){
            int num=0;
            for(int i=0;i<board.length;i++){
                if(board[i][move-1]!=0){
                    carts.push(board[i][move-1]);
                    board[i][move-1]=0;
                    break;
                }
            }
           
        }
        System.out.println(Arrays.toString(board[3]));
        System.out.println(carts.toString());
        //15351214
        //01130302

        
        
        return answer;
    }
    
    
}
