package ClassObjects;

public class Student {
    String name;
    int age;
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
    public static void main(String[]args){
        Student student1=new Student();
        student1.name="Akshay";
        student1.age=9;
        student1.displayDetails();
        Student student2=new Student();
        student2.name="Shrihari";
        student2.age=19;
        student2.displayDetails();
    }
}
