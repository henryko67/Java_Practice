public class array {
    public static void main(String[] args) {
        // Declare 10 int variables at once
        int[] intArray = new int[10];

        // 'index' is a way to refer to which one of the memory block 
        // you're referring to.
        // It starts from 0 
        for (int i = 0; i < 10; i++) {
            intArray[i] = 2;
        }
        intArray[0] = 1;

        for (int i = 0; i < 10; i ++) {
            System.out.println(intArray[i]);
        }
    }
}
