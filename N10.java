import java.util.Scanner;

/**
 * Дано трехзначное число. Найти сумму и произведение его цифр.
 */
public class N10 {
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

//      System.out.println("Сотен \t\t= " + a + "\nДесятков\t= " + b + "\nЕдиниц\t\t= " + c);
        int sum = a + b + c;
        int proizved = a * b * c;
        System.out.println("Суума цифр числа\t\t"+num + "\t= "+sum);
        System.out.println("Произведение цифр числа\t"+num+"\t= "+proizved);
    }
}