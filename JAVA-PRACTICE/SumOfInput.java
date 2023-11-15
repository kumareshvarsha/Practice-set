import java.util.Scanner;

public class SumOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter the "+i+ " input:");
            int number=sc.nextInt();
            sum+=number;
        }
        System.out.println("The sum of all the inputs : "+sum);
        
    }
}
