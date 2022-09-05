package integers;


import java.util.ArrayList;
import java.util.List;

public class FinBizz {
    public static void main(String[] args) {
        System.out.println(finBizz(15));
    }

    public static List<String> finBizz(int n){
        List<String> result = new ArrayList<>();
        for(int i=1;i<= n;i++){
            if(i% 3 ==0 && i%5==0){
                result.add("FinBizz");
            }else if(i%3 ==0){
                result.add("Fin");
            }else if(i%5 == 0){
                result.add("Biz");
            }else {
                result.add(Integer.toString(i));
            }
        }
        return  result;
    }
}
