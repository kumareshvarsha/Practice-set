class Phone{
    int number;
    public void setNumber(int n){
        this.number=n;
    }
    public int getNumber(){
        return number;
    }
}
class SmartPhone extends Phone{
    public void PlayMusic(){
        System.out.println("music is playing");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        SmartPhone s= new SmartPhone();
        s.setNumber(879015209);
        System.out.println(s.getNumber());
        s.PlayMusic();
    }
}
