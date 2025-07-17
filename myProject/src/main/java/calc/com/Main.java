package calc.com;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
    //public static void main(String[] args) {
      // new projectFrame();
   // }
//}
        public class Main{
            public static void main(String[] args) {
                Color c1 = Color.RED;
                System.out.println("Red Enum name:" + c1.name());
                System.out.println("Red Enum value:" + c1.getValue());

                for (Color color : Color.values()) {
                    System.out.println("Enum value: " + color.getValue());
                }
            }
        }


