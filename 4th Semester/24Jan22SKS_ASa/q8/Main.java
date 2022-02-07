// package q8;

class Student {
    public String name;
    private int rollNo;
    private float score;

    // constructor - 1
    Student() {
        this.rollNo = 0;
        this.name = "dummy";
        this.score = 0f;
    }
    // constructor - 2
    Student(int rollNo) {
        this.rollNo = rollNo;
        this.name = "dummy";
        this.score = 0f;
    }
    // constructor - 3
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = 0f;
    }
    // constructor - 4
    Student(int rollNo, String name, float score) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }
    // copy constructor
    Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.score = s.score;
    }

    // getter
    void display(){
        System.out.println("----------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Score: " + this.score);
        System.out.println("----------------------------------");
    }

}


public class Main {
    public static void main(String[] args){
        // using only roll no.
        Student s1 = new Student(1);
        System.out.println("s1:");
        s1.display();
        
        // using roll no. and name
        Student s2 = new Student(1,"Rohit");
        System.out.println("s2:");
        s2.display();
        
        // using roll no., name and score
        Student s3 = new Student(1,"Rohit",90);
        System.out.println("s3:");
        s3.display();
        
        // using no value
        Student s4 = new Student();
        System.out.println("s4:");
        s4.display();

        // using copy constructor (deep copy)
        Student s5 = new Student(s3);
        System.out.println("Before:");
        s5.display();
        
        s3.name = "Rohit Sadhu";
        System.out.println("After change:");
        s5.display();
        
        
        // using simple assignment operator = (shallow copy)
        Student s6 = s3;
        System.out.println("Before:");
        s6.display();

        s3.name = "Rohit";
        System.out.println("After change:");
        s6.display();
    }
}
