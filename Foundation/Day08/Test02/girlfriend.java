package Day08.Test02;

public class girlfriend {
    //属性
    private String name;
    private int age;

    //针对每一个私有的成员变量，都要提供set和get方法
    //set方法 给成员变赋值的
    //get方法 对外提供成员变量的值

    //给成员变量赋值的 
    public void setName(String n) {
        name = n;
    }

    public String  getName(){
        return name;
    }

    public void setAge(int a){
        if(a >= 18 && a  <= 35){
            age = a;
        }else{
            System.out.println("非法参数");
        }
    }

    public int getAge(){
        return age;
    }


    //行为
    public void sleep() {
        System.out.println("在睡觉");
    }
    public void eat() {
        System.out.println("在吃饭");
    }
}
