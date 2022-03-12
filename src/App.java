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
        int[] stages={2, 1, 2, 4, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(n,stages)));
    }
    public static int[] solution(int N, int[] stages) {
        Map<Integer,String>stageAndPersons=new HashMap<>();
        for(int i=1;i<=N;i++){
            String[] personAndCount=Optional.ofNullable(stageAndPersons.get(i)).orElseGet(()->"0,0").split(",");
            int person=Integer.parseInt(personAndCount[0]);
            person+=1;
            int count=0;
            for(int ii:stages){
                if(ii>=i){
                    count+=1;
                }
            }
            String personAndCounts=person+","+count;
            stageAndPersons.put(i, personAndCounts);
        }
        System.out.println(stageAndPersons.toString());
        for(Entry<Integer, String> stageAndPerson:stageAndPersons.entrySet()){
            String[] personAndCount=stageAndPerson.getValue().split(",");
            int person=Integer.parseInt(personAndCount[0]);
            int count=Integer.parseInt(personAndCount[1]);
            stageAndPersons.replace(stageAndPerson.getKey(),Double.toString((double)person/count));
        }
        //System.out.println(stageAndPersons.toString());
        int[] answer = new int[N];
        return answer;
    }
    
    
}
