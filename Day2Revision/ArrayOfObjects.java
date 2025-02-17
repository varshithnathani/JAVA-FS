package Day2Revision;

class Student{
    int rollno;
    String name;
    int age;

}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1234;
        s1.name = "John Doe";
        s1.age = 25;

        Student s2 = new Student();
        s2.rollno = 2345;
        s2.name = "Doe";
        s2.age = 35;

        Student s3 = new Student();
        s3.rollno = 3456;
        s3.name = "Doe John";
        s3.age = 45;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].rollno +". "+students[i].name+" Age: "+students[i].age);
        }

        System.out.println();

        // ENHANCED FOR LOOP
        for(Student stud: students){
            System.out.println(stud.rollno +". "+stud.name+" Age: "+stud.age);
        }

    }
}
