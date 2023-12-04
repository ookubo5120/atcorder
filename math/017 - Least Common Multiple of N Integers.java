import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) A[i] = sc.nextLong();

		// 答えを求める
		long R = lcm(A[0], A[1]);
		for (int i = 2; i < N; i++) {
			R = lcm(R, A[i]);
		}

		// 出力
		System.out.println(R);
		sc.close();

	}

	public static long gcd(long a, long b) {
		if(b ==0 ) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	
	public static long lcm(long a, long b) {
		return (a / gcd(a,b)) * b;
	}
}