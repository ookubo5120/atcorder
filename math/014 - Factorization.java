import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        sc.close();
		for(long i = 2; i*i <= n; i++){
			while(n%i==0){
				System.out.print(i + " ");
				n /= i;
			}
		}
		if(n>1) System.out.println(n);
	}
}