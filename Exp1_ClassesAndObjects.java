class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Exp1_ClassesAndObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vidhi";
        s1.rollNo = 1;
        s1.display();
    }
}
