package kata2;

import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        String[] data = {"Pepe","Maria","Pedro","Juan","Pepe","Juan","Juan","Pedro","Pepe","Maria","Pedro","Pepe"};
        Histogram hist = new Histogram(data);
        Map<String, Integer> histogram = hist.getHistorgram();
         
        Iterator<Map.Entry<String,Integer>> entries= histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String,Integer> entry = entries.next();
            System.out.println("Key: "+ entry.getKey() + ", value: "+ entry.getValue());
        }
    }
    
}
