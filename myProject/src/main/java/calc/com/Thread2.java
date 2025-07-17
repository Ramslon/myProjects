package calc.com;

class Thread2 implements Runnable {
    public void run() {
         try {
             System.out.println("Thread2 is running");

         }catch(Exception e) {
             System.out.println("Exception is caught ");
         }
    }
}
