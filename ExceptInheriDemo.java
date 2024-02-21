     import java.util.Scanner;

     class WrongAge extends Exception {
         public WrongAge(String message) {
             super(message);
         }
     }

     class Father {
         int age;

         public Father(int age) throws WrongAge {
             if (age < 0) {
                 throw new WrongAge("Age cannot be negative.");
             }
             this.age = age;
         }

         public int getAge() {
             return age;
         }
     }

     class Son extends Father {
         int sonAge;

         public Son(int fatherAge, int sonAge) throws WrongAge {
             super(fatherAge);

             if (sonAge >= fatherAge) {
                 throw new WrongAge("Son's age cannot be greater than or equal to the father's age.");
             }

             this.sonAge = sonAge;
         }

         public int getSonAge() {
             return sonAge;
         }
     }

     public class ExceptInheriDemo {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             try {
                 System.out.print("Enter Father's Age: ");
                 int fatherAge = scanner.nextInt();
                 Father father = new Father(fatherAge);

                 System.out.print("Enter Son's Age: ");
                 int sonAge = scanner.nextInt();
                 Son son = new Son(father.getAge(), sonAge);

                 System.out.println("Father's Age: " + father.getAge());
                 System.out.println("Son's Age: " + son.getSonAge());

                 System.out.print("Enter another Son's Age: ");
                 int invalidSonAge = scanner.nextInt();
                 Son invalidSon = new Son(father.getAge(), invalidSonAge); 

             } catch (WrongAge e) {
                 System.out.println("Exception caught: " + e.getMessage());
             } finally {
                 scanner.close();
             }
         }
     }
