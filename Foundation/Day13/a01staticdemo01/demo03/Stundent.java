//定义一个JavaBean
//学生类的属性为：name age gender
package demo03;

public class Stundent {
    private String name ;
    private int age;
    private String gender;

    public Stundent (){}

    public Stundent(String name,int age,String grnder){
        this.name = name;
        this.age = age;
        this.gender = grnder;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender; 
    }

    public String getGender(){
        return gender;
    }
}
