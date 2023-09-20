import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String rawInput = myObj.nextLine();

        while (rawInput.length() > 1){

            System.out.println("Please input again");
            rawInput = myObj.nextLine();
            rawInput = rawInput.toLowerCase();
        }

        final char input = rawInput.charAt(0);
//        final int input = Integer.parseInt(rawInput);

        for (char i = 'a'; i <= input; i++) {

            int numberOfSpaceToPrint = input - i;
            for (int z = 0; z < numberOfSpaceToPrint; z++) {
                System.out.print(" ");
            }

            int additionalValues = i - 1;
            for (int a = 0; a < additionalValues; a++){

                System.out.print(i);
            }

            for (int e = 1; e <= i; e ++) {

                System.out.print(i);
            }
            System.out.println();
        }

        final int newInput = input - 1;

        // other side of diamond
        for (int p = newInput; p >= 1; p--) {


            int numberOfSpaceToPrint = input - p;
            for (int z = 0; z < numberOfSpaceToPrint; z++) {

                System.out.print(" ");
            }

            int additionalValues = p - 1;
            for (int a = 0; a < additionalValues; a++){

                System.out.print(p);
            }

            for (int e = 1; e <= p; e ++) {

                System.out.print(p);
            }

            System.out.println();

        }



            //userName.charAt(2);
        //System.out.println(userName);
    }


    // user inputs a
    // -> "A"
    // user inputs b
    // "  b"
    // " aaa"
    // user inputs c
    // "   c"
    // "  bbb"
    // " aaaaa"

    // user inputs 4
    // "   1"
    // "  222"
    // " 33333"
    // "4444444"





}