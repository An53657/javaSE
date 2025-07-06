/* 基类 MinecraftEntity
属性：
name (生物名称, String)
health (生命值, double)
构造方法：MinecraftEntity(String name, double health)
方法：
void displayInfo()：打印生物基础信息
示例输出：牛 生命值: 10.0
 */
public class MinecraftEntity {
    private String name;
    private double health;

    public MinecraftEntity() {
    }

    public MinecraftEntity(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    // 打印生物基础信息
    public void displayInfo() {
        System.out.println("打印基础信息");
    }
}
