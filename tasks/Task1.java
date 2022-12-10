import java.util.Scanner;

public class Task1
{
    public static int remainder(int a, int b) {
        return a % b;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = remainder(a, b);
		System.out.print(res);
	}
}
