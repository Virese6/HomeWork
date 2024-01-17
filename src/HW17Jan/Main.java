package HW17Jan;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        System.out.println(returnMap(map));
    }
    public static Map<String,String> returnMap(Map<String,String> map){
        Map<String,String> returnMap = new HashMap<>(map);
        if((map.containsKey("a")) && (map.containsKey("b"))){
            returnMap.put("ab",(map.get("a"))+(map.get("b")));
        }
        return returnMap;
    }
}
/*
Дана Map<String, String> map,
 написать метод, который вернет Мап, такую,
что если в исходной map есть ключи ‘a’ и ‘b’,
то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b. Если нет, ничего не менять.
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
 */