public class question2 {
    // This question is going to use a concept we didn't get to cover in class, called a loop. 
    // Before attempting this, please take a look at lec1/loop.java

   public static void main(String[] args) {
		System.out.println("Prime numbers " + 50);
		for (int i = 1; i < 50; i++) {
			if (isPrime(i)) {
				System.out.print(i + ", ");
			}
		}
	}

   // This function basically determines whether a number is prime or not
   public static boolean isPrime(int i) {
       boolean isPrimeNumber = true;
       for (int k = 2; k < i; k++) {
           if (i % k == 0) {
               isPrimeNumber = false;
               break;
           }
       }
       if (isPrimeNumber) {
           return true;
       } else {
           return false;
       }
   }
}
