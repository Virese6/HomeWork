public class HomeW2911 {
    public static void main(String[] args) {
        String word = "hello";//t1
        System.out.println(returnDoubleNumbers(word));//t1
        String cup = "tee";//t2
        String glass = "cola";//t2
        System.out.println(returnDoubleStrings(cup, glass));//t2
        String lol = "man";//t3
        System.out.println(change(lol));//t3
    }
    public static int returnDoubleNumbers(String word) {//t1
    int doubleSum = word.length() * 2;
        return doubleSum;
    }
    public static String returnDoubleStrings(String cup,String glass){//t2
        String finish = cup.substring(1) + glass.substring(1);
        return finish.toUpperCase();
    }
    public static String change(String lol){//t3
        char ver = lol.charAt(0);
        String lolNew = lol.substring(1);
        return lolNew + ver;
    }
}
