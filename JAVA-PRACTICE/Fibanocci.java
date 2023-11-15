// import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();

        //  int a=0;
        //  int b=1;
        //  if (n<0) {
        //     System.out.println("n should not be negetive");
        //  }
        //  if (n==0) {
        //     System.out.println(a);
        //  }
        //  else if(n==1) {
        //     System.out.println(b);
        //  }
        //  else{
        //     int c=0;
        //     for(int i=2;i<=n;i++){
        //         c=a+b;
        //         a=b;
        //         b=c;
        //         System.out.println(c);
        //     }
            
        //  }

        int n=10;
        
        int first=0;
        int second=1;
        
            for(int i=0;i<=n;i++){
                if (i==0) {
                    System.out.println(first);
                } else if(i==1){
                    System.out.println(second);
                }
                int third=first+second;
                first=second;
                second=third;
                System.out.println(third);
                
            }
    }
}
