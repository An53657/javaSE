/*新增属性：
dropItem (掉落物, String)
构造方法：PassiveMob(String name, double health, String dropItem)
重写方法：
void displayInfo()：扩展输出掉落物信息
 */
public class PassiveMob extends MinecraftEntity {
    // 新竲属性
    private String dropItem;

    public PassiveMob() {
    }

    public PassiveMob(String name, double health, String dropItem) {
        super(name, health);
        this.dropItem = dropItem;
    }

    public void setDropItem(String dropItem) {
        this.dropItem = dropItem;
    }

    public String getDropItem() {
        return dropItem;
    }

    @Override
    public void displayInfo() {
        System.out.println("扩展输出掉落物信息");
    }
};