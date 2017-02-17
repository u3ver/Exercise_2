import java.util.Scanner;

/**
 * Дни недели пронумерованы следующим образом: 1 — понедельник, 2 — вторник, …, 6 — суббота,
 * 7 — воскресенье. Дано целое число K, лежащее в диапазоне 1–365.
 * Определить номер дня недели для K-го дня года, если известно,
 * что в этом году 1 января было средой.Дано целое положительное число.
 * Проверить истинность высказывания: «Данное число является нечетным трехзначным».
 */
public class N7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int firstDayYear = 3; // поправка на 1 января = СРЕДА
        int week = 7;
        int daysYear = 365;
        int whatDay = (N % week)+3;

        if (whatDay > 7) {
            whatDay = whatDay % week;
        }

        System.out.print(whatDay+"-й день недели\t");

        switch (whatDay) {
            case 1:
                System.out.println("Понедельник\n");
                break;
            case 2:
                System.out.println("Вторник\n");
                break;
            case 3:
                System.out.println("Среда\n");
                break;
            case 4:
                System.out.println("Четверг\n");
                break;
            case 5:
                System.out.println("Пятница\n");
                break;
            case 6:
                System.out.println("Суббота\n");
                break;
            case 7:
                System.out.println("Воскресение\n");
                break;
        }

        if (N % 2 != 0 && N / 2 >= 50) {
            System.out.println("Введенное число " + N + " является нечетным трехзначным ");
        }
        else
            System.out.println("Введенное число " + N + " НЕ является нечетным трехзначным ");

    }
}
