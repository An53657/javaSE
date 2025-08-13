package Day33;

public class BigStar implements Star {
    private String name;
    private int age;
    private String address;

    public BigStar() {
    }

    public BigStar(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", address = " + address + "}";
    }

    public String sing(String name) {
        System.out.println(this.name + "正在唱" + name);
        return "谢谢";
    }

    public void dance() {
        System.out.println(this.name + "正在挑" + name);
    }
}
