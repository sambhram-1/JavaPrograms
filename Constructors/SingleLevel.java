class SingleLevel{
String name="Rahul";
void displayName(){
System.out.println(name);
}
}
class Student extends SingleLevel{
int marks=90;
void displayMarks(){
System.out.println(marks);
}
public static void main(String[]args){
Student s=new Student();
s.displayName();
s.displayMarks();
}
}