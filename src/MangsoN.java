import java.util.Scanner;

public class MangsoN {
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
        int SoNguyenChan=0;
        int SoNguyenLe = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int array[] = new int[n];


        System.out.println("Nhập các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                SoNguyenChan++;
            } else {
                SoNguyenLe++;
            }
        }

        System.out.println("Số nguyên chẵn trong mảng = " + SoNguyenChan);
        System.out.println("Số nguyên lẻ trong mảng = " + SoNguyenLe);
    }
}
