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



     public void checkPerson(String name, int age ) throws NameException, IncorrectArgument, NullException {
         if(!this.name.equals(name))
             throw new NameException("name mismatch");
         if(age <=0 || age >= 120)
             throw new IncorrectArgument("Enter the correct age");
         if(weight > 100)
             throw new NullException("weight not initialized");

    }


    public static void main(String[] args) {

         HandlingExceptions handlingExceptions = new HandlingExceptions();

         try{
             handlingExceptions.checkPerson("someone", 150);
         }
         catch (NameException |  IncorrectArgument |  NullException e){

             System.out.println(e.getMessage());
        }
         finally{
             System.out.println("Bye");
        }
    }








}

