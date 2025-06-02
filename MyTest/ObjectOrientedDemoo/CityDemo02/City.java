package MyTest.ObjectOrientedDemoo.CityDemo02;

public class City {
     private String name;
     
     public City(){}

     public City(String name){
        this.name = name;
     }

     public void setName(String name){
        this.name = name;
     }
     public String getName(){
        return name;
     }
}