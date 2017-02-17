import java.util.Scanner;

/**
 * Дано четырехзначное число. Проверить истинность высказывания:
 * «Данное число читается одинаково слева направо и справа налево» (т.е. является палиндромом)
 */
public class N9 {
    public static void main(String[] args) {
        N3 n3 = new N3();
        Scanner scan = new Scanner(System.in);
        System.out.print("input 4 digit int number\t");
        int num = scan.nextInt();
//        int num = 1234;
        int halfNum = (int) (num / 100);
        int halfNum2 = (int) (num % 100);

        System.out.println("\nпервая часть =\t" + halfNum + "\nвторая часть =\t" + halfNum2+"\n");

        if (halfNum == swap(halfNum2)) {
            System.out.println("Введенное число " + num + " является палиндромом");
        } else {
            System.out.println("число " + num + " палиндромом НЕ является");
        }
    }
//  выпилено из N3
    public static int swap(int toswap) {
        int num = toswap;
        int newNum = 0;
        int x = 0;
        int y = 0;
        x = Math.round(num / 10);
        y = (int) num % 10;

        newNum = y * 10 + x;
        return newNum;
    }

}