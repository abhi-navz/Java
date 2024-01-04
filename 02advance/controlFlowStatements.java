import java.util.Scanner;

public class controlFlowStatements {
    public static void main(String[] args) {

        /*
         * The statements inside your source files are generally executed from top to
         * bottom, in the order that they appear. Control flow statements, however,
         * break up the flow of execution by employing decision making, looping, and
         * branching, enabling your program to conditionally execute particular blocks
         * of code. This section describes the decision-making statements (if-then,
         * if-then-else, switch), the looping statements (for, while, do-while), and the
         * branching statements (break, continue, return) supported by the Java
         * programming language.
         */

        // if-else and if-elseif n nesting
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        // switch statement

        int month = 8;
        String monthString;
        switch (month) {
            case 1:
                monthString = "january";
                break;
            case 2:
                monthString = "february";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);

        // Loops

        // while loop.

        /*
         * The while statement evaluates expression, which must return a boolean value.
         * If the expression evaluates to true, the while statement executes the
         * statement(s) in the while block. The while statement continues testing the
         * expression and executing its block until the expression evaluates to false.
         * Using the while statement to print the values from 1 through 10
         */

        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        // do while loop

        /*
         * The Java programming language also provides a do-while statement, which can
         * be expressed as follows:
         * 
         * do {
         * statement(s)
         * } while (expression);
         * The difference between do-while and while is that do-while evaluates its
         * expression at the bottom of the loop instead of the top. Therefore, the
         * statements within the do block are always executed at least once.
         */
        int count1 = 12;
        do {
            System.out.println("Count is: " + count1); // output: Coutn is: 12 , even tho the statement is a falsy.
            count1++;
        } while (count1 < 11);

        // The for Statement or for-loop

        /*
         * 
         * The for statement provides a compact way to iterate over a range of values.
         * Programmers often refer to it as the "for loop" because of the way in which
         * it repeatedly loops until a particular condition is satisfied. The general
         * form of the for statement can be expressed as follows:
         * 
         * for (initialization; termination; increment) {
         * statement(s)
         * }
         */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }

        /*
         * The for statement also has another form designed for iteration through
         * Collections and arrays This form is sometimes referred to as the enhanced for
         * statement, and can be used to make your loops more compact and easy to read.
         * To demonstrate, consider the following array, which holds the numbers 1
         * through 10:
         * 
         */

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i : numbers) {
            System.out.println(i);
        }

        /*
         * The break Statement
         * 
         * 
         * The break statement has two forms: labeled and unlabeled. You saw the
         * unlabeled form in the previous discussion of the switch statement. You can
         * also use an unlabeled break to terminate a for, while, or do-while loop.
         */

        int[] arrayOfInts = { 32, 87, 3, 589,
                12, 1076, 2000,
                8, 622, 127 };

        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i + "in the array.");
        } else {
            System.out.println(searchfor + " is not in the array");
        }

        /*
         * An unlabeled break statement terminates the innermost switch, for, while, or
         * do-while statement, but a labeled break terminates an outer statement. The
         * following program, BreakWithLabelDemo, is similar to the previous program,
         * but uses nested for loops to search for a value in a two-dimensional array.
         * When the value is found, a labeled break terminates the outer for loop
         * (labeled "search"):
         */

        int[][] arrayOfInts1 = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int searchfor1 = 127;

        int i1;
        int j1 = 0;
        boolean foundIt1 = false;

        search: for (i1 = 0; i1 < arrayOfInts1.length; i1++) {
            for (j1 = 0; j1 < arrayOfInts1[i1].length; j1++) {
                if (arrayOfInts1[i1][j1] == searchfor1) {
                    foundIt1 = true;
                    break search;
                }
            }
        }

        if (foundIt1) {
            System.out.println("Found " + searchfor1 + " at " + i1 + ", " + j1);
        } else {
            System.out.println(searchfor1 + " not in the array");
        }
        /*
         * The break statement terminates the labeled statement; it does not transfer
         * the
         * flow of control to the label. Control flow is transferred to the statement
         * immediately following the labeled (terminated) statement.
         */

        // # The continue Statement
        /*
         * The continue statement skips the current iteration of a for, while , or
         * do-while loop. The unlabeled form skips to the end of the innermost loop's
         * body and evaluates the boolean expression that controls the loop. The
         * following program, ContinueDemo , steps through a String, counting the
         * occurrences of the letter "p". If the current character is not a p, the
         * continue statement skips the rest of the loop and proceeds to the next
         * character. If it is a "p", the program increments the letter count.
         */

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        
        int numPs = 0;

        for (int i3 = 0; i3 <searchMe.length(); i3++) {
            // interested only in p's
            if (searchMe.charAt(i3) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }

}
