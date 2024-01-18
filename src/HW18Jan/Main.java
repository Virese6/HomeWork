package HW18Jan;

import java.util.ArrayList;
import java.util.List;

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
    public static int returnNumber(List<String> names, String nameToFind){
        int count=0;
        for (int i=0; i<names.size();i++){
            if(names.contains(nameToFind)){
                count++;
                names.remove(nameToFind);
            }
            }
        return count;
        }

    }

/*
Задача на мапы: Дан список имен, в котором некоторые имена повторяются.
Написать метод, который по имени вернет количество вхождений этого имени в список.
т.е. метод принимает лист и имя и возвращает число, соответствующее количеству раз,
которое это имя встречается в листе
 */