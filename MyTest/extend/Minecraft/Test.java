//题目要求
//设计一个简单的《我的世界》生物继承体系，仅使用基础继承概念（不使用抽象类或多态）。
public class Test {
    public static void main(String[] args) {
        // 创建被动生物Cow
        PassiveMob Cow = new PassiveMob("牛", 15, "凋落物：皮革");
        // 获取并打印
        System.out.println("名字： " + Cow.getName() + ("血量： " + Cow.getHealth() + ("掉落物： " + Cow.getDropItem())));
        Cow.displayInfo();

        System.out.println("--------------------------");

        HostileMob zombie = new HostileMob("zombie", 20, 3);
        // 打印信息
        System.out.println("名字： " + zombie.getName() + "血量： " + zombie.getHealth() + "掉落物： " +
                "攻击力" + zombie.getAttAckDamage());
        zombie.displayInfo();
    }
}
