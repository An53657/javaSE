package Day13.a03extendsdemo03;

public class Manager extends Employee{
    private double bonus;

    public Manager(){}

    public Manager(String id, String name ,double salary,double bonus){
        super(id,name,salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getbonus(){
        return bonus;
    }

        //重写work
    @Override
    public void work() {
        
      System.out.println("管理他人");
    }
}
