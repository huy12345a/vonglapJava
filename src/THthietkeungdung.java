import java.util.Scanner;

public class THthietkeungdung {
    public static void main(String[] args) {
        System.out.println("chon 1 hinh duoi day");
        System.out.println("1. hinh vuong rong");
        System.out.println("2. hinh vuong dac");
        System.out.println("3. duong thang");
        Scanner scanner = new Scanner(System.in);
        System.out.println("chon di ban: ");
        int sc = scanner.nextInt();
        switch (sc) {
            case 1:
                System.out.println("* * * *");
                System.out.println("*     *");
                System.out.println("*     *");
                System.out.println("* * * *");
                break;
            case 2:
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                System.out.println("* * * *");
                break;
            case 3:
                System.out.println("* * * *");
        }
    }
}
