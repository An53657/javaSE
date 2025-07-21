package Day23.a04treemapdemo04.treemapdemo02;

public class Stundent implements Comparable<Stundent> {
    private String name;
    private int age;

    public Stundent() {
    }

    public Stundent(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public int compareTo(Stundent o) {
        // 按照学生升序排列， 年龄一样的按照姓名首字母排列，同姓名，同年龄视为同一个人

        // this: 表示添加的元素
        // o 表示红黑树中存在的元素

        // 返回值
        // 整数：表示当前添加元素是小的，存左边
        // 负数：表示当前添加元素是大的，存右边
        // 0： 表示当前添加元素已经存在，舍弃
        int i = this.getAge() - o.getAge();
        i = i == 0 ? this.name.compareTo(o.getName()) : i;
        return i;
    }

     
 

    @Override
    public String toString() {
        return "Stundent{name =" + name + ", age =" + age + "}";
    }

}
