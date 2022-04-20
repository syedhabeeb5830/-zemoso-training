package Assignment_7;


interface Unicycles{
    public void aboutUniCycle();
}

interface Bicycles{
    public void aboutBiCylce();
}

interface Tricycles{
    public void aboutTriCycle();
}


interface Cycles extends Unicycles,Bicycles,Tricycles{
    public void aboutCylces();
}

class UniFactory implements Unicycles{

    @Override
    public void aboutUniCycle() {
        System.out.println("UniFactory manufactures unicycles");
    }
}

class BiFactory implements Bicycles{

    @Override
    public void aboutBiCylce() {
        System.out.println("BiFactory manufactures bicycles");
    }
}

class TriFactory implements Tricycles{

    @Override
    public void aboutTriCycle() {
        System.out.println("TriFactory manufactures tricyles");
    }
}


public class TaskFour {

    public static void main(String[] args) {


        UniFactory uniFactory = new UniFactory();
        uniFactory.aboutUniCycle();

        BiFactory biFactory = new BiFactory();
        biFactory.aboutBiCylce();;

        TriFactory triFactory = new TriFactory();
        triFactory.aboutTriCycle();




    }



}

