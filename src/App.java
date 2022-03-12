import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) throws Exception {
        int n=5;
        int[] stages={2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(n,stages)));
    }
    public static int[] solution(int N, int[] stages) {
        Map<Integer,Double>stageAndPersons=new HashMap<>();
        for(int i=1;i<=N;i++){
            int count=0;
            int totalCount=0;
            int maxCount=0;
            for(int ii:stages){
                if(ii>=i){
                    totalCount+=1;
                }
                if(ii==i){
                    count+=1;
                }
                if(ii==N+1){
                    maxCount+=1;
                }
            }
            double personAndCounts=0.0;
            if(i==N){
                personAndCounts=(double)maxCount/totalCount;
            }else{
                personAndCounts=(double)count/totalCount;
            }
            if(personAndCounts==1.0){
                personAndCounts=0;
            }
            stageAndPersons.put(i, personAndCounts);
        }
        System.out.println(stageAndPersons.toString());
        int[] answer = new int[N];
        return answer;
    }
    
    
}
