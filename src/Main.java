public class Main {
    public static void main(String[] args) {
        /*Задача 1
-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi
(т.е. присвоить первому элементу значение Kiwi)
-Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая отдельный метод. */
        //-------------------------------------------------------------------------------
        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
        System.out.print("The basket contains the following fruits: ");
        for (int i = 0; i < fruits.length; i++) {
            if (i == 3) {
                System.out.println(fruits[i] + ".");
            } else System.out.print(fruits[i] + ", ");
        }
        fruits[0] = "Kiwi";
        System.out.print("The basket now contains the following fruits: ");
        for (int i = 0; i < fruits.length; i++) {
            if (i == 3) {
                System.out.println(fruits[i] + ".");
            } else System.out.print(fruits[i] + ", ");
        }
        //-------------------------------------------------------------------------------
        /*Задача 2
Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
Задание можно выполнить непосредственно в методе main либо создать отдельный метод. */
        //-------------------------------------------------------------------------------
        System.out.print("The basket now contains the following fruits: ");
        for (int i = 0; i < fruits.length; i++) {
            if (i % 2 == 0) {
                System.out.print(fruits[i] + ", ");
            }
        }
        //-------------------------------------------------------------------------------
        /* Задача 3
Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
public static int findMin(int[] ints)*/
        //-------------------------------------------------------------------------------
        System.out.println();
        int[] ints = {3, 23, 2, 58};
        System.out.println("Minimal element of massive is " + findMin(ints));
    }
    public static int findMin(int[] ints) {
        int intsMin = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < intsMin) {
                intsMin = ints[i];
            }
        }
        return intsMin;
    }
}