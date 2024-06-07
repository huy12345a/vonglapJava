import java.util.Scanner;

public class BThienthihinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu dai: ");
        int a = sc.nextInt();
        System.out.println("nhap vao chieu rong: ");
        int b = sc.nextInt();
        System.out.println("hinh chu nhat : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("nhap so dong cua tam giac: ");
        int n = sc.nextInt();
        System.out.println("hinh tam giac");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

