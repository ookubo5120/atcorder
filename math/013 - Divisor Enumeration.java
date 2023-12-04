import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        // 約数を列挙
        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
                if (i != N / i) {
                    System.out.println(N / i);
                }
            }
        }

    }
}
