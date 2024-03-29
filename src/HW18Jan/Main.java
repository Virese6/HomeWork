package HW18Jan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Bob");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Bob");
        String nameToFind = "Ivan";
        System.out.println(returnNumber(names,nameToFind));
    }
    public static int returnNumber(List<String> names, String nameToFind) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : names) {
            if (map.containsKey(name))
                map.put(name, map.get(name) + 1);
            else map.put(name, 1);
        }
        return map.containsKey(nameToFind) ? map.get(nameToFind) : 0;
    }
}

/*
Задача на мапы: Дан список имен, в котором некоторые имена повторяются.
Написать метод, который по имени вернет количество вхождений этого имени в список.
т.е. метод принимает лист и имя и возвращает число, соответствующее количеству раз,
которое это имя встречается в листе
int count=0;
        for (int i=0; i<names.size();i++){
            if(names.contains(nameToFind)){
                count++;
                names.remove(nameToFind);
            }
            }
        return count;
        }
 */