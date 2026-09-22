package ClassObjects;

public class EmployeeC {
    String name;
    int age;
    String role;
EmployeeC(String name,int age,String role){
        this.name=name;
        this.age=age;
        this.role=role;
        }
void display(){
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("Role:"+role+"\n");
    }
public static void main(String[]args){
    EmployeeC emp1=new EmployeeC("Akshay",19,"Developer");
    emp1.display();
    EmployeeC emp2=new EmployeeC("ShriHari",1,"Manager");
    emp2.display();
    }
}
