import java.util.Scanner;

public class THtinhtienlai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so tien gui: ");
        int a = sc.nextInt();
        System.out.println("nhap vao lai suat theo nam: ");
        float b = sc.nextFloat();
        System.out.println("nhap vao so thang");
        int c = sc.nextInt();
        System.out.println("lai suat nhan duoc : "+ a*(b/12)*c);
    }
}
