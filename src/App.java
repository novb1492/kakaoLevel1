import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        int n=5;
        int[] stages={2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(n,stages)));
    }
    public static int[] solution(int N, int[] stages) {
        Map<Integer,String>stageAndPerson=new HashMap<>();
        for(int stage:stages){
            String[] personAndCount=Optional.ofNullable(stageAndPerson.get(stage)).orElseGet(()->"0,0").split(",");
            int person=Integer.parseInt(personAndCount[0]);
            person+=1;
            int count=0;
            for(int i:stages){
                if(i>=stage){
                    count+=1;
                }
            }
            String personAndCounts=person+","+count;
            stageAndPerson.put(stage, personAndCounts);
        }
        System.out.println(stageAndPerson.toString());
        
        int[] answer = new int[N];
        return answer;
    }
    
    
}
