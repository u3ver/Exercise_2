/**
 * Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
 */
public class N3 {
    //    public static void swap(String[] args) {
    public static void swap(String[] args) {
        int num = Integer.parseInt(args[0]);
        int newNum = 0;
        int x = 0;
        int y = 0;
        x = Math.round(num / 10);
        y = (int) num % 10;

        newNum = y * 10 + x;
        System.out.println("Число\t" + num + "\tПосле перестановке цифр исходного числа = " + newNum);

    }
}
