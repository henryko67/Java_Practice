



public class girl {
    public static void main(String[] args) {
        boolean amIRich = false;
        boolean amIGoodLooking = true;

        if (amIRich && amIGoodLooking) {
            // it will only go into this part of the code if the condition is true
            System.out.println("I want to date you!");
        } 
        if (amIGoodLooking) {
            System.out.println("Wow you're so good looking, can I kiss you once? (but not date)");
        } 
        if (amIRich) {
            System.out.println("Can you buy me a bag?");
        }
    }
}
