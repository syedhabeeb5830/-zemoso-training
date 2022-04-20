package Assignment_7;


interface One{
    public void greetOne();
    public void aboutOne();
}
interface Two{
    public void greetTwo();
    public void aboutTwo();
}
interface Three{
    public void greetThree();
    public void aboutThree();

}
interface Four extends One,Two,Three{
    public void greetFour();

}

class Concrete{
    public void about(){
        System.out.println("this is a concrete class");
    }
}
class Five extends Concrete  implements Four{
    public void greetOne(){
        System.out.println("hello from interface One");
    }
    public void aboutOne(){
        System.out.println("this is interface One");
    }
    public void greetTwo(){
        System.out.println("hello from interface Two");
    }
    public void aboutTwo(){
        System.out.println("this is interface two");
    }
    public void greetThree(){
        System.out.println("hello from interface Three");
    }
    public void aboutThree(){
        System.out.println("this is interface Three");
    }
    public void greetFour(){
        System.out.println("hello from interface Four ");
    }
    public void method1(One one){
        one.aboutOne();
    }
    public void method2(Two two){
        two.aboutTwo();
    }
    public void method3(Three three){
        three.aboutThree();
    }
    public void method4(Four four){
        four.greetFour();;
    }
}

public class TaskThree {


    public static void main(String[] args) {
        Five five=new Five();
        five.method1(new Five());
        five.method2(new Five());
        five.method3(new Five());
        five.method4(new Five());
    }
}

