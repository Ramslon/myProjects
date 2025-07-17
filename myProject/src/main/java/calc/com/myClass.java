package calc.com;

import java.lang.reflect.Method;

public class myClass {
    @MyCustomAnnotation(value = 10)
    public void sayHello() {
        System.out.println("my custom annotation");
    }
    public static void main(String[] args)throws Exception {
        myClass obj = new myClass();
        Method methodVal = obj.getClass().getMethod("sayHello");
        MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is:" + myCustomAnnotation.value());
    }
}
