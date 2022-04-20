package Assignment_7;



class Cycle{
    public void balance(){
        System.out.println("cycle should be balanced");
    }
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("difficult ot balance");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("easy to balance");
    }
}

class Tricycle extends Cycle{

}



public class TaskTwo {
    public static void main(String[] args) {
        Cycle[] c=new Cycle[3];
        c[0]=new Bicycle();
        c[0].balance();
        c[1]=new Unicycle();
        c[1].balance();
        c[2]=new Tricycle();
        c[2].balance();
    }




}

