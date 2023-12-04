import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int currentGCD = a[0];
        for (int i = 1; i < n; i++) {
            currentGCD = gcd(currentGCD, a[i]);
        }
        sc.close();
        System.out.println(currentGCD);
    }

    // ユークリッドの互除法を使用して最大公約数を計算するメソッド
    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
