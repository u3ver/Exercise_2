/**
 * С начала суток прошло N секунд (N — целое). Найти количество полных часов,
 * минут и секунд, прошедших с начала последних суток.
 */
public class N6 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int hour = 3600;
        int min = 60;
        int fullHour = 0;
        int fullMin = 0;
        int fullSec = 0;

        fullHour = Math.round(N / hour);
        fullMin = (int) ((N % hour) / min);
        fullSec = (int) ((N % hour) % min);

        System.out.println("Имеем секунд = "+N);
        System.out.println("Количество полных часов =\t"+fullHour);
        System.out.println("Количество полных минут =\t" + fullMin);
        System.out.println("Остаток секунд =\t\t\t" + fullSec);
    }




}
