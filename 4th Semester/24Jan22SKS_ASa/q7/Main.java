// package q7;

class Student {
    private String name;
    private int rollNo;
    private float score;

    // constructor
    Student(String name, int rollNo, float score) {
        this.name = name;
        this.rollNo = rollNo;
        this.score = score;
    }

    // getter
    void display(){
        System.out.println("----------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Score: " + score);
        System.out.println("----------------------------------");
    }

    // setter
    void setAttributes(String name, int rollNo, float score){
        this.name = name;
        this.rollNo = rollNo;
        this.score = score;
    }

    // copy function
    void copy(Student s){
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.score = s.score;
    }

}


public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Rohit", 1, 90);
        Student s2 = new Student("Rohan", 2, 80);

        s1.display();
        s2.display();

        s1.setAttributes("Rohan", 10, 90);
        s2.setAttributes("Rohit", 20, 80);

        s1.display();
        s2.display();

        s1.copy(s2);
        s1.display();
        s2.display();
    }
}
