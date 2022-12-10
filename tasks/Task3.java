import java.util.Scanner;

public class Task3
{
    public static int animals(int a, int b, int c) {
        return a * 2 + b * 4 + c * 4;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = animals(a, b, c);
		System.out.print(res);
	}
}
