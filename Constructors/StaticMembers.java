    class StaticMembers{
        String name;
        int age;
        static String college="XYZ";
        StaticMembers(int age, String name){
            this.age=age;
            this.name=name;
        }
        void displayDetails(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("College: "+college+"\n");
        }
public static void main(String[]args){
      StaticMembers emp1=new StaticMembers(25,"John");
      emp1.displayDetails();

    }
}

