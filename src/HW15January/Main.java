package HW15January;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        numbers1 = List.of(1,2,3,4);
        numbers2 = List.of(5,2,3,8);

        System.out.println(returnList(numbers1,numbers2));
    }

    public static List<String> returnList (List<Integer> numbers1, List<Integer> numbers2) {
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i < numbers1.size(); i++) {
            if (numbers1.get(i).equals(numbers2.get(i))) {
                returnList.add("Yes");
            }
            else {
                returnList.add("No");}
        }
        return returnList;
    }
}
//OUTPUT [No, Yes, Yes, No]
/*
Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист,
содержащий элементы Yes или No, где значения на i-м месте зависит от того,
равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать.
 */