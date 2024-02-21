package SEE;
     import CIE.Student;

     public class External extends Student {
         int[] externalMarks;

         public External(String usn, String name, int sem, int[] externalMarks) {
             super(usn, name, sem);
             this.externalMarks = externalMarks;
         }
     }
