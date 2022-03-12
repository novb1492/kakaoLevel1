import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] lottos={45, 4, 35, 20, 3, 9};//{0, 0, 0, 0, 0, 0};//{44, 1, 0, 0, 31, 25};
        int[] win_nums={20, 9, 3, 45, 4, 35};//{38, 19, 20, 40, 15, 25};//{31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int rigtNumCount=0;
        int zeroNumCount=0;
        for(int lotto:lottos){
            if(lotto==0){
                zeroNumCount+=1;
                continue;
            }
            for(int winNum:win_nums){
                if(lotto==winNum){
                    rigtNumCount+=1;
                    break;
                }
            }
        }
       // System.out.println("rigth: "+rigtNumCount);
        //System.out.println("zero: "+zeroNumCount);
        int max=rigtNumCount+zeroNumCount;
        int min=rigtNumCount;
        //System.out.println("max: "+max);
        //System.out.println("min: "+min);
        answer[0]=getRank(max);
        answer[1]=getRank(min);
        return answer;
    }
    private static int getRank(int num) {
        switch (num) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
        
            default:
                return 6;
        }
    }
}
