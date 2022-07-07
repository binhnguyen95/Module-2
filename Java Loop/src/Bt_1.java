import java.util.Scanner;

public class Bt_1 {
    public static void main(String[] args) {
        int n;
        int status = 1;
        int num = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        n = scanner.nextInt();
        if (n > 1) {
            System.out.println(n+" Số nguyên tố đầu tiên là:");
        }
        for ( int i = 2 ; i <=n ;  ) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ) {
                if ( num%j == 0 ) {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 ) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}