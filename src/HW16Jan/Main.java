package HW16Jan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Welcome");
        strings.add("World");
        strings.add("Java");

        System.out.println(result(strings));
    }

    public static String result(List<String> strings) {
        String longest = strings.get(0);
        String shortest = strings.get(0);
        for(int i = 0; i< strings.size(); i++){
            if(strings.get(i).length()>longest.length()){
                longest = strings.get(i);
            }
            if(strings.get(i).length()<shortest.length()){
                shortest = strings.get(i);
            }
        }
        return strings.indexOf(longest)< strings.indexOf(shortest) ? longest:shortest;
    }
}

/*++
Написать метод, принимающий не пустой лист строк и возвращающий строку,
которая встречается раньше в листе - самую короткую или самую длинную.
Все строки в листе разной длины
 */