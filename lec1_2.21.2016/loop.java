// We're going to look at how to make a "loop"
//
//
// A "loop" in CS jargon means repeating something
//
// For example, let's say you wanted to add 1 to a variable x, for 5 times.
//
// How would you do this? 
// Well, a dumb way would be to do this: 
// x = 5; 
// x += 1; 
// x += 1; 
// x += 1; 
// x += 1; 
// x += 1;
//
//
// But this is a LOT of code, right? 
// So what we need to do is instead of doing this, we want to be able to do the same thing many times.
// 
// I'm going to introduce you to "while" loop.
//
// SYNTAX:
//          while (condition) {
//              // do something
//          }
//
//      a while loop checks whatever's in "condition", and it goes into the loop whenever it has the value of True.
//
//
// Adding 1 to x 5 times can be done like this:
// int count = 0;
// while (count < 5) {
//      x += 1;
//      count += 1;
// }
//
// POTENTIAL CAVEAT
//  You need to be careful when doing this. For example: 
//      int count = 0;
//      while (count < 5) {
//          x += 1;
//      }
//      If you do this, this loop will NEVER end. Guess why? 
//      count never gets updated from 0, but the condition is checking whether count is less than 5. So it'll always be True. 
//      That means this will get stuck here forever
//
//      Another way to do this is just this:
//      while (true) {
//          x += 1; 
//      }
//
//
//
// Another way to do loop is "for" loops. 
//
// SYNTAX:
//          for (initialization ; condition ; increments) {
//              // do something
//          }
//
//    The example above can be translated into for loops easily:
//      for (int count = 0; count < 5; count += 1) {
//          x += 1;
//      }
//
//      They essentially do the same thing as while loop, but you can do counter variable initialization and condition checks and increments all in one line.
//
//
// Look at the code below for an example
public class loop {
    public static void main(String[] args) {
        int i = 0; 
        while (i < 10) {
            System.out.println("i: " + i); // This is gonna print i: 1, i:2, i:3, ... i:9
            i += 1;
            // When i == 10, it'll go out of this loop
        }

        for (int j = 0; j < 10; j += 1) {
            System.out.println("i: " + j); // This is gonna print i: 1, i:2, i:3, ... i:9 too.
        }
    }
}
