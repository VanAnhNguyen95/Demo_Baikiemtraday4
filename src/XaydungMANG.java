public class XaydungMANG {
    public static void main(String[] args) {

        int[] Arr1 = {2, 7, 6, 8, 9, 21, 34, 56};

        int n;

// tìm phần tử lớn nhất trong mảng
        {
            int max = Arr1[0];
            for (int num : Arr1) {
                if (max < num)
                    max = num;
            }
            // lấy ra giá trị max của chuỗi Arr1
            System.out.println("Số lớn nhất trong mảng là: Arr1," + max);

        }
// lấy ra phần tử nho nhất trong mảng
        {
            int min = Arr1[0];
            for (int num : Arr1) {
                if (min > num)
                    min = num;
            }
            // lấy ra giá trị max của chuỗi Arr1
            System.out.println("Số nhỏ nhất trong mảng là: Arr1," + min);

        }
        // Tính tổng số chẵn trong mảng
        int sum2 = 0;

        for (int i = 0; i < Arr1.length; i++) {
            if (Arr1[i] % 2 == 0) {
                sum2 += Arr1[i];


                System.out.println("Tổng số nguyên chẵn trong mảng = " + sum2);

            }
            // tính tổng số đầu tiên và số cuối cùng trong mảng
            int sodautien = Arr1[0]; // gán vị trí lấy ra số đầu tiên
            int socuoicung = Arr1[Arr1.length-1];// gán vị trí lấy ra số cuối cùng
            int sum3 =  sodautien+ socuoicung;
            System.out.println("Tổng số đầu tiên và cuối cùng trong mảng= " + sum3 );

        }
    }
}

