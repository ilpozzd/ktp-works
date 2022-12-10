import java.util.Scanner;

public class Task2
{
    public static double triArea(int a, int h) {
        return 1.0 / 2.0 * a * h;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int h = sc.nextInt();
		double res = triArea(a, h);
		System.out.print(res);
	}
}
