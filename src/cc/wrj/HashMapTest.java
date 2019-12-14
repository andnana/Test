package cc.wrj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("1", "libai");
        map.put("2", "zhangsan");
        map.put("3", "wangwu");
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(map.get(key));
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry entry: entries){
            System.out.print("key: " + entry.getKey() + " value: " + entry.getValue());
            System.out.println();
        }
        Collection<String> values = map.values();
        for(String value: values){
            System.out.print("value: " + value);
            System.out.println();
        }

    }
}
