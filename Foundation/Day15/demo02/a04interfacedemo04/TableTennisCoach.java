package Day15.demo02.a04interfacedemo04;

public class TableTennisCoach extends Coach  implements English{

    public TableTennisCoach(){}
    public TableTennisCoach(String name, int age){
        super(name, age);
    }

    @Override
    public void teach() {
         System.out.println("乒乓球教练在教如何打篮球");
    }

    @Override
    public void speakEnlish() {
       System.out.println("乒乓球教练在学如何学英语");
    }
  
}
