import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if (isPrime(num)) {
            System.out.println("The given number "+num+ "is a prime number");
        }
        else{
            System.out.println("The given number "+num+"is not a prime number");
        }
    }
}
