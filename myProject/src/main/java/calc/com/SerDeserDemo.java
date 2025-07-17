/*package calc.com;

import java.io.*;

public class SerDeserDemo {
    public static void main(String[] args) {
        studentClass student=new studentClass("John",25,"23 East,California");
         String filename="C:\\Users\\hp\\Documents\\myProject\\src\\main\\java\\calc\\com\\studentClass.java";
         FileOutputStream fileOut=null;
         ObjectOutputStream objOut=null;
         //Serialization
        try {
            fileOut=new FileOutputStream(filename);
            objOut=new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized: /n" + student);

        }catch(IOException ex){
            System.out.println("IO Exception is caught");
        }
        //Deserialization
        FileInputStream fileIn=null;
        ObjectInputStream objIn=null;
        try{
            fileIn=new FileInputStream(filename);
            objIn=new ObjectInputStream(fileIn);
            student object=(student) objIn.readObject();
            System.out.println("Object has been deserialized: /n" + object);

            objIn.close();
            fileIn.close();
        }catch(IOException ex){
            System.out.println("IO Exception is caught");
        }catch(ClassNotFoundException ex){
            System.out.println("ClassNotFoundException" + "is caught");
        }

    }
}
*/