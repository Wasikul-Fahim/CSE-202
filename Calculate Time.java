import java.util.Scanner;

public class Calculate Time {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculate calc = new calculate();

        int sec = calc.Sec(n);
        int min = calc.Min(n);
        int hour = calc.Hour(n);
        System.out.printf("%d : %02d : %02d", hour, min, sec);
        System.out.println();
    }
}
