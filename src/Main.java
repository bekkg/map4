import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map< Car , Car_Val > map = new HashMap<>();
        map.put(new Car ( 2, 1923) , new Car_Val( 2000, "bmw", " black"));

        for ( HashMap.Entry< Car , Car_Val>  i : map.entrySet()){
            System.out.println( i. getKey() + "   " + i.getValue());
        }


    }
}