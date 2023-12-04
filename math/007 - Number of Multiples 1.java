import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    sc.close();
    int count = 0;
    
    for(int i = 0;i<n;i++){
      if(i%x==0||i%y==0){
        count++;
      }
    }
    System.out.println(count);


  } 
}