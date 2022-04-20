package Assignment_7;



abstract class Rodent{
    Rodent(){
        System.out.println("This is Rodent class");
    }
    public abstract void about();
    public abstract void name();
}



class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("this is Gerbil class");
    }
    @Override
    public void about() {
        System.out.println("Gerbil is lengthy");
    }

    @Override
    public void name() {
        System.out.println("this is Gerbil ");
    }
}

class Hamster extends Rodent{
    Hamster(){
        System.out.println("this is Hamster class");
    }

    @Override
    public void about() {
        System.out.println("Hamster is fatty");
    }

    @Override
    public void name() {
        System.out.println("this is Hamster");
    }
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("this is Mouse class");
    }

    @Override
    public void about() {
        System.out.println("Mouse  is black");
    }

    @Override
    public void name() {
        System.out.println("this is mouse");
    }
}

public class TaskOne {
    public static void main(String[] args) {
        Rodent[] rodent=new Rodent[3];
        rodent[0]=new Mouse();
        rodent[0].about();
        rodent[0].name();
        rodent[1]=new Gerbil();
        rodent[1].name();
        rodent[1].about();
        rodent[2]=new Hamster();
        rodent[2].name();
        rodent[2].about();
    }

}

