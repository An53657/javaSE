package Day13.a03extendsdemo03;

public class Cook extends Employee{
    public Cook(){}
    public Cook(String id, String name ,double salary){
        super(id, name,salary);
    }
    @Override
    public void work() {
        // TODO Auto-generated method stub
       System.out.println("正在炒菜");
    }
}
