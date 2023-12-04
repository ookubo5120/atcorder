import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        if (isPrime(N)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static boolean isPrime(long N){
        // 素数判定
        if(N<2){
            return false;
        }
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//ラッパークラスは実行が遅い。基本的にはプリミティブ型を使う。
