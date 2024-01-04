import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];

        // alternative ways
        int[] array1 = new int[10];
        int[] array2 = { 1, 3, 4, 5, 6, 7, 8 }; // no need to specify size in advance.

        // initialization using for loop

        for (int i = 1; i < array.length; i++) {
            array[i] = i;
        }
        for (int i : array) {
            System.out.println(array[i]);

        }

        // ## multidimensional array;

        // In the Java programming language, a multidimensional array is an array whose
        // components are themselves arrays. This is unlike arrays in C or Fortran. A
        // consequence of this is that the rows are allowed to vary in length.

        String[][] names = {
                { "Mr. ", "Mrs. ", "Ms. " },
                { "Smith", "Jones", "Abhinav" },
                { "dikosta", "samuel", "lamborgini", "gupta" }
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
        // Mr Abhinav Gupta
        System.out.println(names[0][0] + names[1][2] + " " + names[2][3]);
        System.out.println(names.length);

        // # Array methods

        // copying arrays
        // The System class has an arraycopy method that you can use to efficiently copy
        // data from one array into another:

        // arraycopy
        /*
         * (sourceArray, int srcPos,destArray, int destPos, int length)
         */
        // The two Object arguments specify the array to copy from and the array to copy
        // to. The three int arguments specify the starting position in the source
        // array, the starting position in the destination array, and the number of
        // array elements to copy.

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[10];
        System.arraycopy(copyFrom, 0, copyTo, 0, 10);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.println(" ");

        // .copyOfRange()
        // modified version of .arraycopy() , just three takes three argument the soruce
        // array, start and end positions.

        String[] copyFrom1 = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo1 = Arrays.copyOfRange(copyFrom1, 2, 9);
        for (String coffee : copyTo1) {
            System.out.print(coffee + " ");
        }
        System.out.println(' ');

        String[] name1 = { "abhinav", "abhishek", "manisha", "nisha", "kabir", "subbu" };
        String[] name2 = { "abhinav", "abhishek", "manisha", "nisha", "kabir", "subbu" };

        Arrays.sort(name1); // sorts the array into ascending order using sequential sort alogrithm
        System.out.println(Arrays.toString(name1)); // converts array to string

        System.out.println(Arrays.binarySearch(name1, "kabir")); // search for a key in specified array;
        System.out.println(Arrays.equals(name1, name2)); // checkes if two arrays are equal {false}

        // Arrays.fill(name1, "Abhinav");
        // The Arrays.fill method in Java is used to fill an array with a specified
        // value.it changes every value to the new specified value. However, the return
        // type of Arrays.fill is void, meaning it doesn't return anything. It directly
        // modifies the elements of the array.

        Arrays.parallelSort(name2); // sorts the array in ascending order using paralleSort algorithm
        System.out.println(Arrays.toString(name2));

        // .stream()
        // Creating a stream that uses an array as its source (the stream method)
         // Assuming 'array' is an array of integers
         int[] arrayNum = {1, 2, 3, 4, 5};

         // Create a stream from the array and map each element to its square
         Arrays.stream(arrayNum)
               .map(x -> x * x)
               .forEach(System.out::println);
    }
    
}
