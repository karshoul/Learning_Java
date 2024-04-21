import java.util.Scanner;
public class Th1_bai1{
public static void main(String[] args) {
    Scanner cs = new Scanner(System.in);
    System.out.print("moi ban nhap mot so nguyen: ");
    int a = cs.nextInt();
int b = Tim_so_Fibonacci(a);
System.out.print("so Fibonacci gan nhat voi so "+a+" la so: "+b);
}
// hàm tìm số Fibonacci gần nhất với số đã nhập
public static int Tim_so_Fibonacci(int n) {
    int a = 0, b = 1;
    while (b <= n) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    // Sau khi vòng lặp kết thúc, a chứa số Fibonacci gần nhất nhỏ hơn hoặc bằng n
    // b chứa số Fibonacci gần nhất lớn hơn n
    // So sánh n với a và b, trả về số Fibonacci gần nhất
    return (Math.abs(n - a) < Math.abs(n - b)) ? a : b;
}
}
