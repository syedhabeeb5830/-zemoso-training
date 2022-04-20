package Assignment_6;

import java.util.List;

public class TaskThree {



    public TaskThree( String s){
        System.out.println(s);
    }


    public static void main(String[] args) {
        TaskThree[] taskThree = new TaskThree[100];

        taskThree[0] = new TaskThree("hello from reference 1");
        taskThree[1]  = new TaskThree( "hello from reference 2");
    }


}

