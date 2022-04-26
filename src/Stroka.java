import java.util.Scanner;

public class Stroka {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String n = in.nextLine();
        System.out.print("Введите второе число: ");
        int m = in.nextInt();
        int c = Integer.valueOf(n);
        if (c == m) { System.out.println("Числа равны"); }
        else {
            if (c < m) {
                System.out.println("Большее число: " + m);
            } else {
                System.out.println("Большее число: " + c);
            }
            if (c < m) {
                double x = (double) c;
                System.out.print("Меньшее число: " + x);
            } else {
                double y = (double) m;
                System.out.print("Меньшее число: " + y);
            }
        }
    }
}
