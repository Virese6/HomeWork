package HW21JanDIFFICULT;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("john");
        names.add("mary");
        names.add("jonh");
        names.add("bill");
        names.add("njoh");
        names.add("amry");
        String nameToFind = "mary";
        System.out.println(map(names,nameToFind).values());
    }
      public static Map<Integer,String> map (List<String> names, String nameToFind){
        int a =0;
          Map<Integer,String> map = new HashMap<>();
          char [] charNameToFind = nameToFind.toCharArray();
          Arrays.sort(charNameToFind);
          String newNameToFindAfterSorting = new String(charNameToFind);
          for(String name:names){
              char[] namesChar = name.toCharArray();
              Arrays.sort(namesChar);
              String namesKey = new String(namesChar);
              if(namesKey.equals(newNameToFindAfterSorting)){
                  map.put(a, name);
                  a++;
              }
          }
          return map;
      }
}
/*
Написать метод, который принимает список имен и их анаграмм и имя,
по которому он возвращает список всех его анаграмм, включая само имя. При решении использовать мапу.
Пример: [john, mary, jonh, bill, njoh, amry], john -> [john,jonh,njoh] (все буквы в словах маленькие)
 */