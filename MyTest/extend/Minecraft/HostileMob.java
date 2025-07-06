/* 继承自 MinecraftEntity
新增属性：
attackDamage (攻击力, double)
构造方法：HostileMob(String name, double health, double attackDamage)
重写方法：
void displayInfo()：扩展输出攻击力信息
示例输出：僵尸 生命值: 20.0, 攻击力: 3.0
 
 */
public class HostileMob extends MinecraftEntity {
    private double attackDamage;

    public HostileMob() {
    }

    public HostileMob(String name, double health, double attackDamage) {
        super(name, health);
      this.attackDamage = attackDamage;
    }

    public void setattAckDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getAttAckDamage() {
        return attackDamage;
    }

    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        System.out.println("扩展输出攻击力信息");
    }
}
