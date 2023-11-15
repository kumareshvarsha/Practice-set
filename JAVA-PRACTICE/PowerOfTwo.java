import java.util.Scanner;

public class PowerOfTwo{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int input=sc.nextInt();

    double result=Math.pow(2, input);

    System.out.println("2^" + input + " = " + result);
    }
    
}