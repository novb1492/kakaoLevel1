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
        int size=board[0].length-1;
        Map<Integer,Integer>selectTimes=new HashMap<>();
        Stack<Integer>carts=new Stack<>();
       for(int move:moves){
            int selectTime=Optional.ofNullable(selectTimes.get(move)).orElseGet(()->0);
            int a=size-selectTime;
            int num=0;
            if(a<0){
                num=0;
            }else{
                num=board[move-1][a];
            }
            selectTime+=1;
            if(selectTime==1){
                selectTimes.put(move, selectTime);
            }else{
                selectTimes.replace(move, selectTime);
            }
            if(num!=0){
                carts.push(num);
            }
        }
        System.out.println(carts.toString());
        return answer;
    }
    
    
}
