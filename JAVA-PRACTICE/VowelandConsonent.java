import java.util.Scanner;

public class VowelandConsonent {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine().toLowerCase();

        int vowels=0;
        int consonent=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    vowels++;
                } else {
                    consonent++;
                }
            }
        }
        System.out.println("No of vowels in a string is : "+vowels);
        System.out.println("No of consonents in a string is : "+consonent);
    }
}
