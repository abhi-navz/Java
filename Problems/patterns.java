public class patterns {
    public static void main(String[] args) {
        // Question 01: Soldi reactangle pattern

        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        System.out.println("Solid rectangle pattern:");

        int n1 = 5;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1; j++) {
                System.out.print("*");
            }
            System.err.println();
        }

        System.out.println(

        );
        // Question 02: Hollow rectangle pattern

        // *****
        // *---*
        // *---*
        // *---*
        // *****

        System.out.println("Hollow rectangle pattern:");

        int n2 = 5;
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n2; j++) {
                if (i == 1 || i == n2 || j == 1 || j == n2) {
                    System.err.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(

        );
        // Quesiton 03 : Half pyramid

        // *
        // **
        // ***
        // ****
        // *****

        System.out.println("Half pyramid:");
        int n3 = 5;
        for (int i = 1; i <= n3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println();

        // 4. Mirrored half pyramid

        // ____*
        // ___**
        // __***
        // _****
        // *****

        System.out.println("mirrored half pyramid:");
        int n4 = 5;
        for (int i = 1; i <= n4; i++) {
            for (int j = 1; j <= (n4 - i + 1); j++) {
                System.out.print(" ");

            }
            for (int j = (n4 - i + 1); j <= n4; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println();

        // 5. Inverted half pyramid

        // *****
        // ****
        // ***
        // **
        // *

        System.out.println("Inverted half pyramid:");
        int n5 = 5;
        for (int i = 1; i <= n5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 6. triangluar pyramid :

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // 1 2 3 4 5 6

        System.out.println("Numerical half pyramid");
        int n6 = 6;
        for (int i = 1; i <= n6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 7. Floyd' trinagle pattern.

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // 16 17 18 19 20 21
        // 22 23 24 25 26 27 28

        int n7 = 7;
        int count = 1;
        System.out.println("Floyd's triangle:");
        for (int i = 1; i <= n7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;

            }
            System.out.println();

        }

    }
}
