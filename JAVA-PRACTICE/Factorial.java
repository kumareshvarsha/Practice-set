public class Factorial {
    public static int factorial(int n){
        int a=1;
        for(int i=1;i<=n;i++){
            a=a*i;
        }
        return a;
    }
    public static void main(String[] args) {
        int number=6;
        int result=factorial(number);
        System.out.println(result);
    }
}
