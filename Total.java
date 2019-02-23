import java.util.Scanner;
public class Total {
    public static void main(String[] args) {

        total();
        cToF();
        circle();
        old();

    }

//    //Tính điểm trung bình
    public static void total() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vật lý :");
        double vat_ly = scanner.nextDouble();
        System.out.println("Hóa học :");
        double hoa_hoc = scanner.nextDouble();
        System.out.println("Sinh học :");
        double sinh_hoc = scanner.nextDouble();
        double so_diem = (vat_ly + hoa_hoc + sinh_hoc) / 3;
        System.out.println("Điểm trung bình : " + so_diem);
    }

//độ C sang độ F
    public static void cToF()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ C :");
        double do_c = scanner.nextDouble();
        double f = do_c *1.8 +32;
        System.out.println(f);
    }

//Diện tích và chu vi hình tròn
    public static void circle()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chiều cao :");
            double height = scanner.nextDouble();
            System.out.println("nhập vào chiều rộng :");
            double width = scanner.nextDouble();
            double s = height * width;
            double v = ( height + width ) * 2;
            System.out.println("Diện tích : " + s);
            System.out.println(" Chu vi : " + v);
        }

//Tính tuổi từ năm sinh
    public static void old()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập năm sinh");
        int year = scanner.nextInt();
        System.out.println("Số tuổi : " + (2019 - year));
    }
}
