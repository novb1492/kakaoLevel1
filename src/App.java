import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
        int[] cart=new int[1000];
        for(int move:moves){
            int realAddress=move-1;
            int selectTime=Optional.ofNullable(selectTimes.get(realAddress)).orElseGet(()->0);
            //System.out.println(selectTime);
            int num=board[realAddress][size-selectTime];
            selectTime+=1;
            if(selectTime==1){
                selectTimes.put(realAddress, selectTime);
            }else{
                selectTimes.replace(realAddress, selectTime);
            }
            System.out.println(num);
        }
        //1/53/51214
        //0/11/30302
        return answer;
    }
    
    
}
