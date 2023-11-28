public class HomeW2811 {
    public static void main(String[] args) {
    //task1
        int[] array1 = {1,2,3,4,7};
        int[] array2 = {1,2,3,4,7};
        System.out.println(compareArrays(array1,array2)? "равны":"не равны");
        //task2
        System.out.println("---------------------------");
        int[] arrayNew ={3,5,2,6,1,7,12};
        System.out.println(calcEvenNumbers(arrayNew));

    }
    //task1
    public static boolean compareArrays(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for(int i=0; i < array1.length; i ++){
            if (array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
    //task 2
    public static int calcEvenNumbers(int[] arrayNew){
        int sum = 0;
        for (int element : arrayNew){
            if(element%2==0)
                sum++;
        }
        return sum;
    }
}
