import java.util.Scanner;

public class Inrabangcuuchuong {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N = (2<N<=20)");
        N = sc.nextInt();


        for (int i = 1; i <= 10; ++i) {
            for (int j = 2; j <= 10; j++) {
                System.out.println(i+" x "+j +" = "+(i*j));
            }

        }
    }
}