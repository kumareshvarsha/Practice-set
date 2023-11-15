public class Reverse {
    public static void main(String[] args) {
        String original="varsha";
        String reversed="";

        int length=original.length();
        for(int i=length-1;i>=0;i--){
            reversed=reversed+original.charAt(i);
        }
        System.out.println("The reversed string is: "+reversed);
    }
}
