import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

     //HAshMap = A data structure that stores key-value pairs keys are unique,bot values can be duplicate
     //         Does not maintain any order,but is memory efficient
        //      HashMap<key,value>


        HashMap<String,Integer> map = new HashMap<>();
        map.put("apple",100);
        map.put("orange",50);
        map.put("banana",40);

        //map.remove("apple");
       // System.out.println(map.get("banana")); // it display value of key
        //System.out.println(map.containsKey("apple")); //it will return true if keys is in hashmap otherwise false
       // System.out.println(map.containsValue(40));
       // System.out.println(map.size());
       for(String k : map.keySet()){
           System.out.println(k + " :" + map.get(k));
       }
    }
}
