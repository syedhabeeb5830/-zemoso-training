package Assignment_7;


public class TaskFive {

    public class FirstOuter {
        public class FirstInner {

            public FirstInner(String message) {
                System.out.println(message);
            }
        }
    }


//    public class SecondOuter {
    //not able to extend FirstInner class
//        public class SecondInner extends FirstOuter.FirstInner {
//         public SecondInner() {
//             super("hello");
//                System.out.println("this is InnerSecond class");
//           }
//      }
//    }

}

