package HW22JanTwo;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File newFile = new File("HW22Jan2.txt");
        System.out.println(strLong(newFile));
    }
    public static String strLong (File newFile){
        String longStr="";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(newFile))){
            String str;
            while((str = bufferedReader.readLine()) != null){
                if(str.length()>longStr.length()){
                    longStr = str;
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return longStr;
    }
}
/*
Написать метод, принимающий текстовый файл, состоящий из нескольких строчек разной длины
и возвращающий самую длинную строчку.
Пример
файл:
aaa
bbbbbbbbbb
cc
вернет метод: bbbbbbbbbb
 */