import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple",0.50);
        map.put("Banana",0.75);
        map.put("Orange",0.65);

        System.out.println(map);

        map.put("Orange",0.25);

        System.out.println(map);

        map.remove("Apple");

        System.out.println(map);
        System.out.println(map.get("Orange"));
        System.out.println(map.containsKey("Apple"));

        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
