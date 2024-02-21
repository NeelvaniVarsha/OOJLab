import java.util.Scanner;

class Student {
    String usn;
    String name;
    int credits[] = new int[5];
    float marks[] = new float[5];

    void studentdetails(String usn, String name, int credits[], float marks[]) {
        this.usn = usn;
        this.name = name;
        this.credits = credits;
        this.marks = marks;
    }

    void printdetails() {
        System.out.println("The usn of student is " + usn);
        System.out.println("The name of student is " + name);
        System.out.println("The credits of subjects are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(credits[i]);
        }
        System.out.println("The marks of the student are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
    }

    float studentsgpa() {
        float sum = 0;
        int creditssum = 0;
        for (int i = 0; i < 5; i++) {
            if (marks[i] >= 90) {
                sum = sum + (credits[i] * 10);
            } else if (marks[i] >= 80) {
                sum = sum + (credits[i] * 9);
            } else if (marks[i] >= 70) {
                sum = sum + (credits[i] * 8);
            } else if (marks[i] >= 60) {
                sum = sum + (credits[i] * 7);
            } else if (marks[i] >= 50) {
                sum = sum + (credits[i] * 6);
            } else if (marks[i] >= 35) {
                sum = sum + (credits[i] * 5);
            } else {
                sum = sum + (credits[i] * 0);
            }

            creditssum = creditssum + credits[i];
        }

        float sgpa = sum / (float) creditssum;
        return sgpa;
    }
}

public class StudentSGPA {
    public static void main(String xx[]) {
        String usn;
        String name;
        int credits[] = new int[5];
        float marks[] = new float[5];
        float sgpa;

        Student s = new Student();
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the usn of student");
        usn = s1.next();
        System.out.println("Enter the name of student");
        name = s1.next();
        System.out.println("Enter the credits of subject");
        for (int i = 0; i < 5; i++) {
            credits[i] = s1.nextInt();
        }
        System.out.println("Enter the marks of student");
        for (int i = 0; i < 5; i++) {
            marks[i] = s1.nextFloat();
        }

        s.studentdetails(usn, name, credits, marks);
        s.printdetails();
        sgpa = s.studentsgpa();
        System.out.println("The sgpa of student is " + sgpa);
    }
}
