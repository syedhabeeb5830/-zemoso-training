package Assignment_8;

 class NameException extends  Exception{
    NameException(String message){
        super(message);
    }
}

class IncorrectArgument extends Exception{
     IncorrectArgument(String message){
         super(message);
     }
}

class NullException extends Exception{
     NullException(String message){
         super(message);
     }
}

public class HandlingExceptions   {


     int weight ;
     String name = "habeeb";



     public void checkPerson(String name, int age ) throws NameException, IncorrectArgument {
         if(weight <= 0)
             throw new NullPointerException();
         if(!this.name.equals(name)) {
             throw new NameException("name mismatch");
         }
         if(age <=0 || age >= 120) {
             throw new IncorrectArgument("Enter the correct age");
         }

    }


    public static void main(String[] args) {

         HandlingExceptions handlingExceptions = new HandlingExceptions();

         try{
             handlingExceptions.checkPerson("someone", 150);
         }
         catch (NameException |  IncorrectArgument |  NullPointerException e){

             System.out.println(e.getMessage());
        }
         finally{
             System.out.println("Bye");
        }
    }


}

