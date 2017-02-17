/**
 * Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
 * не использую никаких дополнительных переменных.
 */
public class N5 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println("Число\t" + num + "\tПосле перестановке цифр исходного числа = " + ((int) num % 10)+Math.round(num / 10));
    }
}
