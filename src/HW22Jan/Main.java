package HW22Jan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File newFile = new File("C:\\Users\\AIT TR Student\\IdeaProjects\\HomeWork27.11\\src\\HW22Jan\\HW22Jan1.txt");
        System.out.println(sum(newFile));
    }

    public static int sum (File newFile){
        int sum = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(newFile))){
            String str;
            while((str = bufferedReader.readLine()) != null){
                sum = sum + Integer.parseInt(str);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        } return sum;
    }
}
/*
.Пусть есть текстовый файл такого вида:
1
2
3
4
5
Нужно написать метод, принимающий файл и возвращающий сумму всех значений
 */