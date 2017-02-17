import java.util.Scanner;

/**
 * Дано двузначное число. Найти сумму и произведение его цифр.
 */
public class N2 {
    public static void main(String[] args) {
        int sum = 0;
        int proizv = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Input not int number to finish ");


        while (scan.hasNextInt()) {
//            try {
            int num = scan.nextInt();

            sum = Math.round(num / 10) + (int) num % 10;
            proizv = Math.round(num / 10) * (int) num % 10;

            System.out.println("Сумма цифр числа " + num + " =\t" + sum);
            System.out.println("Произведеник цифр числа " + num + " =\t" + proizv);

//             } catch (NumberFormatException e) {
//               System.err.println("Args must be integers");
//               continue;
//        }
    }
}
}
