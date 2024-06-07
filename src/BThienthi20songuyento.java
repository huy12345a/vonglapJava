import java.util.Scanner;

public class BThienthi20songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so luong can in");
        int n = sc.nextInt();
        int count=0;
        int num = 2;
        while (count<n) {
            boolean check = true;
            for (int i = 2; i <=Math.sqrt(num) ; i++) {
                if (num%i==0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(num +" ");
                count ++;
            }
            num++;

        }

    }
}
