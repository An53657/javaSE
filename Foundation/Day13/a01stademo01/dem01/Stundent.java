//需求 用JavaBean类来描述这个班级的学生
//成员变量 姓名 年龄 性别
///成员方法 学习
package Day13.a01stademo01.dem01;

public class Stundent {
    public static String techername;
    private String name;
    private int age;
    private  String gender;

    public Stundent() {
    }

    public Stundent(String name , int age, String gender){
        this.name = name;
        this.age = age;
        this.gender= gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void study() {
        System.out.println(name + "在学习");
    }

    public void show(){
        System.out.println(name + ", " + age + ", " + gender  + techername);
    }
}
