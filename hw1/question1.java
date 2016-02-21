public class question1 {
    public static void main(String[] args) {
        int x = 6;
        int y = 4;
        int z = twoNumDifference (x, y);
        System.out.println("Diff:" +z);
        // Write a function that does:
        // 1. Takes in 2 numbers and subtracts the smaller one from the bigger one
        // i.e. subtractSmallOne(3, 5) == 2
        // i.e. subtractSmallOne(5, 3) == 2
        //
    }
    public static int twoNumDifference(int x, int y) {
        return x - y;
    }
}
