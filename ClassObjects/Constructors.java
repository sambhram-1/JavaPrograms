package ClassObjects;

public class Constructors {
    String Brand;
    int Year;
    Constructors(String brand,int age){
        this.Brand=brand;
        this.Year=age;
    }
    void displayDetails(){
        System.out.println("Brand: "+Brand);
        System.out.println("Year: "+Year+"\n");
    }
    public static void main(String[]args){
        Constructors car1=new Constructors("Lexus",2018);
        car1.displayDetails();
        Constructors car2=new Constructors("Lambhorgini",2020);
        car2.displayDetails();
        Constructors car3=new Constructors("Honda",2019);
        car3.displayDetails();
    }
}
