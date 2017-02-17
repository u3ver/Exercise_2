import java.util.Scanner;

/**
 * Дано трехзначное число. Проверить истинность высказывания:
 * «Цифры данного числа образуют возрастающую последовательность». например, 123, 456 и т. п.
 */
public class N8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input 3 digit INTEGER");
        int num = scan.nextInt();
        int a, b, c;
//        сотни                 194
        a = (int) num / 100;
//        Десятки
        b = (int) ((num - (a * 100)) / 10);
//        единицы
        c = num % 10;

        System.out.println("Сотен \t\t= "+a+"\nДесятков\t= "+b+"\nЕдиниц\t\t= "+c);

        if (a < b && b < c) {
            System.out.println("Цифры данного числа образуют возрастающую последовательность");
        } else {
            System.out.println("ну не вышла .... возрастающая последовательность");
        }
    }
}
