package Assignment_7;


public class TaskFive {

    public class First {
        public class InnerFirst {
            public InnerFirst(String s) {
                System.out.println(s);
            }
        }


    }


    public class Second {
        public class InnerSecond extends First {
            public InnerSecond() {
                System.out.println("this is InnerSecond class");
            }
        }
    }

}

