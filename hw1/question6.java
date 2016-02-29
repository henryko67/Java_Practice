public class question4 {
    public static void main(String[] args) {
        // Print all integers that are multiples of 3 or 5 but is NOT a multiple of 15 below 100
        // i.e. 3, 5, 6, 9, 10, 12, 18 (skip 15 because that's a multiple of 15)
    for (int i = 3; i < 100; i++) {
			if (i % 15 != 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
