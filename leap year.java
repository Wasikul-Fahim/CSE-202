import java.util.Scanner;

public class leap year.java
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            if (n % 400 == 0) {
                System.out.println("Leap Year");
            }
            if (n % 4 == 0 && n % 100 != 0) {
                System.out.println("Leap Year");
            }
            else {
                System.out.println(n + " is not Leap Year");
            }

    }
}
