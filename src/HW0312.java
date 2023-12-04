import java.util.Arrays;

public class HW0312 {
    public static void main(String[] args) {
        //t1
        String name = "name";
        String name1 = "amen";
        System.out.println(ret(name, name1));
        //t2
        int index = 3;
        String str = "Hello";
        System.out.println(removeCharAtIndex(str, index));
        //t3
        String string = "money";
        int begin = 1;
        int end = 4;
        System.out.println(ourSubstring(string, begin, end));

    }
    public static boolean ret (String name, String name1){//t1
        char[] nameCh = name.toCharArray();
        char[] name1Ch = name1.toCharArray();
        Arrays.sort(nameCh);
        Arrays.sort(name1Ch);
        boolean result = Arrays.equals(nameCh, name1Ch);
        return result;
    }
    public static String removeCharAtIndex( String str, int index){//t2
        String strNew = str.substring(0, index );
        String strNew2 = str.substring(index +1);
        return strNew + strNew2;
    }
    public static String ourSubstring(String string, int begin, int end){
        String res = "";
        for (int i = begin; i<string.length() && i<end; i++){
            res = res + string.charAt(i);
        }
        return res;
    }

}
