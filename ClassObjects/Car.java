package ClassObjects;
public class Car {
    String Brand;
    String Model;
    String Color;
    int Year;
    float mileage;
    void displayDetails(){
        System.out.println("Brand: "+Brand);
        System.out.println("Model: "+Model);
        System.out.println("Color: "+Color);
        System.out.println("Year: "+Year);
        System.out.println("Mileage: "+mileage+"\n");
    }

public static void main(String[]args){
    Car car1=new Car();
    car1.Brand="Lexus";
    car1.Model="LFA";
    car1.Color="Red";
    car1.Year=2018;
    car1.mileage=12.0f;
    car1.displayDetails();
    Car car2=new Car();
    car2.Brand="Lambhorgini";  
    car2.Model="Aventador";
    car2.Color="Orange";
    car2.Year=2020;
    car2.mileage=5.0f;
    car2.displayDetails();
    Car car3=new Car();
    car3.Brand="Honda";
    car3.Model="Civic";
    car3.Color="Blue";
    car3.Year=2019;
    car3.mileage=18.0f;
    car3.displayDetails();
}
}