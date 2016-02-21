



public class integer {
    public static void main(String[] args) {
        int x= 3;
        int y = 100;
        int z = someFunction(x, y);
        /*
        "String" == Bunch of letters
        "myName"
        2 3 4 
        "2" != 2
        */
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("x*y*z" + product(x, y, z));
    }

    public static int someFunction(int n1, int n2) {
        return n1 + n2;
    }


}
