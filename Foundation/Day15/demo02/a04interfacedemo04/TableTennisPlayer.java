package Day15.demo02.a04interfacedemo04;

public class TableTennisPlayer extends Sport implements English {

    public TableTennisPlayer(){}
    public TableTennisPlayer(String name ,int age){
        super(name, age);
    }

    @Override
    public void speakEnlish() {
      System.out.println("乒乓球运动员在打乒乓球");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在打乒乓球");
    }
    
}
