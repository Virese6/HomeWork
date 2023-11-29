public class HomeW2911 {
    public static void main(String[] args) {
        int[] array = {10,10,10,20,3,5};
        System.out.println(returnNumbers(array));

    }
    public static boolean returnNumbers(int[] array){
        int sum=0;
        boolean result = true;
        for (int i = 0; i < array.length; i ++){
            if(array[i] == 10){
                sum++;
                if (sum == 3){
                    return result;
                }
            }
        }
        return !result;
    }
}
