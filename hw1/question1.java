public class question1 {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        int z = twoNumDifference (x, y);
        System.out.println("Diff:" +z);
    }
    public static int twoNumDifference(int x, int y) {
        if (x > y) { 
            return x - y;
        } else {
            return y - x;
        }
    }
}
