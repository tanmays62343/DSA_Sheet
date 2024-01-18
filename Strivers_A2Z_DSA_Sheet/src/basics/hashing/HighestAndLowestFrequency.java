package basics.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class HighestAndLowestFrequency {
    public static void main(String[] args) {
        int [] arr = {10, 5, 10, 15, 10, 5};
        countFreq(arr);
    }

    static void countFreq(int [] arr){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }

        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("Highest Element is "+maxEle);
        System.out.println("Lowest Element is "+minEle);

    }

}
