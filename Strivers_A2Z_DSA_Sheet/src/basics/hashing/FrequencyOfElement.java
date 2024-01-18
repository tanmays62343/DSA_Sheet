package basics.hashing;

//We can create a hash array of 10^6 in main and 10^7 Globally and not beyond that
//Hash map is made internally using Division method

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int [] arr = {10,5,10,15,10,5};
        frequency(arr);

    }

    static void frequency(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            } else{
                map.put(arr[i],1);
            }
        }

        map.forEach((key,value) -> System.out.println(key + "->" + value));
    }

}
