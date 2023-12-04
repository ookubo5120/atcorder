import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int gcd = 0;
		while (a>0) {
			gcd = b%a;
			b = a;
			a = gcd;
		}
		System.out.println(b);
	}
}