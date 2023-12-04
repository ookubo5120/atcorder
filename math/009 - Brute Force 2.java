import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        // 全ての部分集合をチェック
        boolean found = false;
        for (int i = 0; i < (1 << N); i++) { // 1 << N は すべてのパターン を表す1000...000の中に111もある
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += A[j];
                }
            }
            if (sum == S) {
                found = true;
                break;
            }
        }

        // 結果の出力
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}