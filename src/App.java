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
        int[] stages={2, 1, 2, 5, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(n,stages)));
    }
    public static int[] solution(int N, int[] stages) {
        Map<Integer,Double>stageAndPersons=new HashMap<>();
        for(int i=1;i<=N;i++){
            int count=0;
            int totalCount=0;
            for(int ii:stages){
                if(ii>=i){
                    totalCount+=1;
                }
                if(ii==i){
                    count+=1;
                }
            }
            stageAndPersons.put(i, (double)count/totalCount);
        }
        System.out.println(stageAndPersons.toString());
        int[] answer = new int[N];
        int postion=0;
        for(Entry<Integer, Double> stageAndPerson:stageAndPersons.entrySet()){
            System.out.println(stageAndPerson.getKey());
           // System.out.println("value:"+stageAndPerson.getValue());
            for(Entry<Integer, Double> s:stageAndPersons.entrySet()){
                if(s.getKey()==stageAndPerson.getKey()){
                    continue;
                }
                System.out.println("value:"+stageAndPerson.getValue());
                System.out.println("value2:"+s.getValue());
                if(stageAndPerson.getValue()<s.getValue()){
                    postion+=1;
                }
            }
            System.out.println("po: "+postion);
            //answer[postion]=stageAndPerson.getKey();
            postion=0;
        }
        return answer;
    }
    
    
}
