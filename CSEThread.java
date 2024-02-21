     class BMSCEthread implements Runnable{
         Thread t;
         BMSCEthread(){
             t = new Thread(this, "BMSThread");
             System.out.println("CT: " + t);
             t.start();
         }

         public void run(){
             try{
                 for (int i=5; i>0; i--){
                     System.out.println("BMS College of Engineering");
                     Thread.sleep(10);
                 }
             } catch(InterruptedException ie){
                 System.out.println("BMSThread Interrupted");
             }
             System.out.println("BMSThread is quitting");
         }
     }

     class CSEThread{
         public static void main(String[] args) {
             new BMSCEthread();
             try{
                 for (int i=5; i>0; i--){
                     System.out.println("CSE");
                     Thread.sleep(2);
                 }
             } catch(InterruptedException ie){
                 System.out.println("CSE Thread Interrupted");
             }
             System.out.println("CSE Thread is quitting");
         }
     }