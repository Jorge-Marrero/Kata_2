package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        Integer[] data = {1,2,5,9,5,14,3,6,2,3,5,14,3,1,7};
        Histogram hist = new Histogram(data);
        Map<Integer, Integer> histogram = hist.getHistorgram();
         
        Iterator<Map.Entry<Integer,Integer>> entries= histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key: "+ entry.getKey() + ", value: "+ entry.getValue());
        }
    }
    
}
