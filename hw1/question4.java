public class question4 {
    public static void main(String[] args) {
        // Print all integers that are multiples of 3 or 5 below 200
        for (int i = 3; i < 200; i++) {
            if ( i % 3 == 0 || i % 5 == 0 ) {
                System.out.println(i);
            }
        }
    }
}
