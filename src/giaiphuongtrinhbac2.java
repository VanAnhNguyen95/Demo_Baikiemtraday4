import java.util.Scanner;
// ax^2+bx+c=0
public class giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        float a, b,c;
        float Delta;
        float x1,x2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a = ");
        a = sc.nextFloat();
        System.out.println("Nhap b = ");
        b = sc.nextFloat();
        System.out.println("Nhap c = ");
        c = sc.nextFloat();
        Delta = b*b-4*(a*c);

        if (Delta < 0) {
             { System.out.println("Phương trình vô nghiệm");

                 if (Delta == 0){
                     x1 =(-b/(2*a));
                     System.out.println("Phương trình co nghiem x2=" + "x1" );
                 }
             }
        } else {
            x1 = (float) ((-b+Math.sqrt(Delta))/(2*a));
            x2 = (float) ((-b-Math.sqrt(Delta))/(2*a));

            System.out.println("Phương trình có 2 nghiệm x =" + "x1");
            System.out.println("Phương trình có 2 nghiệm x =" + "x2");
        }



    }
}
