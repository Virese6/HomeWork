public class HomeW2811 {
    public static void main(String[] args) {
    //task1
        int[] array1 = {1,2,3,4,7};
        int[] array2 = {1,2,3,4,7};
        System.out.println(compareArrays(array1,array2)? "равны":"не равны");
    }
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
}
