package in.my.map;

import java.util.*;

public class TestingMap {

    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>() ;

        map.put("HArsh", 111);
        map.put("rohit", 1132);
        map.put("shri", 332);
        map.put("naru", 324);

        System.out.println(map.size());

        System.out.println(map.get("rohit"));
        System.out.println(map.containsKey("HArsh"));
        System.out.println(map.remove("shri"));


        for (String s : map.keySet()) {
            System.out.printf("%s  %d \n", s,map.get(s));
        }

    }
}
