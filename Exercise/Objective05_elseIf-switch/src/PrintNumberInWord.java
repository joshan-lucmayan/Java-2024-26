/**
 * Trying nested-if and switch-case statements.
 */
public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
    public static void main(String[] args) {
        int number = 11;  // Set the value of "number" here!

        // Using nested-if

        if (number == 1) {   // Use == for comparison
            System.out.println("One from if-else");
        } else if (number == 2 ) {
            System.out.println("Two from if-else");
        } else if (number == 3) {
            System.out.println("Three from if-else");
        } else if (number == 4){
            System.out.println("Four from if-else");
        } else if (number == 5){
            System.out.println("Five from if-else");
        } else if (number == 6){
            System.out.println("Six from if-else");
        } else if (number == 7){
            System.out.println("Seven from if-else");
        } else if (number == 8){
            System.out.println("Eight from if-else");
        } else if (number == 9){
            System.out.println("Nine from if-else");
        } else if (number == 10){
            System.out.println("Ten from if-else");
        }
        else {
            System.out.println("Greater than Ten... from if-else");
        }

        // Using switch-case-default
        switch(number) {
            case 1 -> System.out.println("One from switch");
            case 2 -> System.out.println("Two from switch");
            case 3 -> System.out.println("Three from switch");
            case 4 -> System.out.println("Four from switch");
            case 5 -> System.out.println("Five from switch");
            case 6 -> System.out.println("Six from switch");
            case 7 -> System.out.println("Seven from switch");
            case 8 -> System.out.println("Eight from switch");
            case 9 -> System.out.println("Nine from switch");
            case 10 -> System.out.println("Ten from switch");
            default -> System.out.println("Greater than Ten... from switch");
        }
    }
}