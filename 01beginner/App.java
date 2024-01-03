import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("hello world");

        // Variable and Data types.

        // # Primitive Data types in java

        String name = "Abhinav Gupta";
        byte smallNum = 100; // 8 bit signed integer ranges from -2^8 to 2^8-1
        short s = 10000; // 16 bit signed integer, value ranges from -2^16 to 2^16-1
        int a = -59038590; // 32 bit signed integer value ranges from -2^32 to 2^32-1
        long longNum = 897892348;// 64 bit signed integer value ranges from -2^64 to 2^64-1
        short b = 6;
        int sum = a + b;
        char c = 'c';
        float f = 3;
        double decimalNum = 5.7;
        boolean isLearning = true;
        System.out.println("String:" + name + ",int type:" + sum + ",long type:" + longNum + ",char:" + c + ",double:"
                + decimalNum + ",boolean:" + isLearning);

        // Taking Input in java

        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter your name:");
        String Name = sc.next(); // .next() takes only one the first entered word.
        /*
        *sc.nextLine(); // can be used to take all the keyword entered 
        *sc.nextInt(); // to take an integer 
        simililary there's more fucntion to take different types of Input.
        */
        boolean isLearningInput =sc.nextBoolean(); // to take a boolean value. 
        System.out.println("Entered Name is: " + Name +" and entered boolean is: "+ isLearningInput);
    }
}
