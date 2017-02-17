/**
 * Дано двузначное число. Вывести вначале его левую цифру (десятки),
 * а затем — его правую цифру (единицы). Для нахождения десятков использовать
 * операцию деления нацело, для нахождения единиц — операцию взятия остатка от деления.
 */
public class Numbers_1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        x = Math.round(num / 10);
        y = (int)num % 10;

        System.out.println("Десятки =\t"+x+"\nЕдиницы =\t"+y);



    }
}
