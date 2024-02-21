import java.util.Scanner;

     public class MainProgram {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             System.out.print("Enter the number of students: ");
             int n = scanner.nextInt();

             External[] students = new External[n];

             for (int i = 0; i < n; i++) {
                 System.out.println("\nEnter details for Student " + (i + 1) + ":");

                 System.out.print("Enter USN: ");
                 String usn = scanner.next();

                 System.out.print("Enter Name: ");
                 String name = scanner.next();

                 System.out.print("Enter Semester: ");
                 int sem = scanner.nextInt();

                 System.out.println("Enter Internal Marks for 5 courses:");
                 int[] internalMarks = new int[5];
                 for (int j = 0; j < 5; j++) {
                     System.out.print("Course " + (j + 1) + ": ");
                     internalMarks[j] = scanner.nextInt();
                 }

                 System.out.println("Enter External Marks for 5 courses:");
                 int[] externalMarks = new int[5];
                 for (int j = 0; j < 5; j++) {
                     System.out.print("Course " + (j + 1) + ": ");
                     externalMarks[j] = scanner.nextInt();
                 }

                 students[i] = new External(usn, name, sem, internalMarks, externalMarks);
             }

             scanner.close();

             displayFinalMarks(students);
         }

         private static void displayFinalMarks(External[] students) {
             System.out.println("\nFinal Marks for Students:");
             for (int i = 0; i < students.length; i++) {
                 System.out.println("\nDetails for Student " + (i + 1) + ":");
                 System.out.println("USN: " + students[i].usn);
                 System.out.println("Name: " + students[i].name);
                 System.out.println("Semester: " + students[i].sem);
     
                 System.out.println("Internal Marks:");
                 for (int j = 0; j < 5; j++) {
                     System.out.println("Course " + (j + 1) + ": " + students[i].internalMarks[j]);
                 }
     
                 System.out.println("External Marks:");
                 for (int j = 0; j < 5; j++) {
                     System.out.println("Course " + (j + 1) + ": " + students[i].externalMarks[j]);
                 }
             }
         }
     }
