public class recursion {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++ ) {
            System.out.println(fibonacci(i));
        }
    }

    // the function fibonacci calling itself
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) { // YOU HAVE TO HAVE A TERMINATION CONDITION
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
