package javarush.JavaSyntax.lvl2.lec06;

public class lecture06_test {
 public static void main (String[] args){
  Car kia = new Car();
  kia.model = "Ceed";
  kia.year = 2017;

  Car subaru = new Car();
  subaru.model = "outback";
  subaru.year = 2019;

  System.out.println("Kia model is " + kia.model);
  System.out.println("Subaru model is " + subaru.model);
  Swap(kia,subaru);
  System.out.println("Kia model is " + kia.model);
  System.out.println("Subaru model is " + subaru.model);
 }

 private static void Swap(Car a, Car b){
  String c = a.model;
  a.model=b.model;
  b.model=c;
  }
  static class Car {
     String model;
     int year;
 }
}

