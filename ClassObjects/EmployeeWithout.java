package ClassObjects;

public class EmployeeWithout {
    String name;
    int age;
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age+"\n");
    }
    public static void main(String[]args){
        EmployeeWithout emp1=new EmployeeWithout();
        emp1.name="John";
        emp1.age=25;
        emp1.displayDetails();
        EmployeeWithout emp2=new EmployeeWithout();
        emp2.name="Smith";
        emp2.age=30;
        emp2.displayDetails();
    } 
}
