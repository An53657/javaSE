//标准的JavaBean怎么写
//1. 类名见名知意
//2. 所要的成员变量都要私要
//3. 构造方法(无参、全参的构造方法)
//4  set\get方法
package Day13.a03extendsdemo03;

public class Employee {
    private String id;
    private String name;
    private double salary;
    
    public Employee(){

    }

    public Employee(String id, String name ,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(String id ){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    //成员方法
    public void work(){
        System.out.println("在工作");
    }

    public void eat (){
        System.out.println("吃米饭");
    }
}
