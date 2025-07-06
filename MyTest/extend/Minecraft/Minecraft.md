# Java继承练习：《我的世界》生物体系设计

## 题目要求
设计一个简单的《我的世界》生物继承体系，仅使用基础继承概念（不使用抽象类或多态）。

### 类结构
1. **基类 `MinecraftEntity`**
   - 属性：
     - `name` (生物名称, String)
     - `health` (生命值, double)
   - 构造方法：`MinecraftEntity(String name, double health)`
   - 方法：
     - `void displayInfo()`：打印生物基础信息  
       示例输出：`牛 生命值: 10.0`

2. **子类 `PassiveMob` (被动生物)**
   - 继承自 `MinecraftEntity`
   - 新增属性：
     - `dropItem` (掉落物, String)
   - 构造方法：`PassiveMob(String name, double health, String dropItem)`
   - 重写方法：
     - `void displayInfo()`：扩展输出掉落物信息  
       示例输出：`牛 生命值: 10.0, 掉落: 皮革`

3. **子类 `HostileMob` (敌对生物)**
   - 继承自 `MinecraftEntity`
   - 新增属性：
     - `attackDamage` (攻击力, double)
   - 构造方法：`HostileMob(String name, double health, double attackDamage)`
   - 重写方法：
     - `void displayInfo()`：扩展输出攻击力信息  
       示例输出：`僵尸 生命值: 20.0, 攻击力: 3.0`

4. **测试类 `MinecraftTest`**
   - 创建以下对象：
     - 被动生物：`Cow`（牛），生命值 10，掉落物 "皮革"
     - 被动生物：`Sheep`（绵羊），生命值 8，掉落物 "羊毛"
     - 敌对生物：`Zombie`（僵尸），生命值 20，攻击力 3
     - 敌对生物：`Creeper`（苦力怕），生命值 15，攻击力 5
   - 调用所有对象的 `displayInfo()` 方法

### 预期输出
    
    牛 生命值: 10.0, 掉落: 皮革
    绵羊 生命值: 8.0, 掉落: 羊毛
    僵尸 生命值: 20.0, 攻击力: 3.0
    苦力怕 生命值: 15.0, 攻击力: 5.0
### 考察知识点
类的继承 (extends 关键字)

子类构造方法中使用 super() 调用父类构造方法

方法重写 (@Override 注解)

子类添加新属性

基础面向对象概念（封装、继承）

### 提示
在子类的 displayInfo() 方法中，可以使用 super.displayInfo() 调用父类方法

注意构造方法中通过 super() 正确初始化父类属性

输出格式需严格匹配预期输出





### 示例



    
## 代码框架

```java
// 基类
class MinecraftEntity {
    protected String name;
    protected double health;
    
    public MinecraftEntity(String name, double health) {
        this.name = name;
        this.health = health;
    }
    
    public void displayInfo() {
        System.out.println(name + " 生命值: " + health);
    }
}

// 被动生物子类
class PassiveMob extends MinecraftEntity {
    private String dropItem;
    
    public PassiveMob(String name, double health, String dropItem) {
        super(name, health); // 调用父类构造方法
        this.dropItem = dropItem;
    }
    
    @Override
    public void displayInfo() {
        // TODO: 重写此方法，先显示基础信息，再添加掉落物信息
    }
}

// 敌对生物子类
class HostileMob extends MinecraftEntity {
    private double attackDamage;
    
    public HostileMob(String name, double health, double attackDamage) {
        super(name, health); // 调用父类构造方法
        this.attackDamage = attackDamage;
    }
    
    @Override
    public void displayInfo() {
        // TODO: 重写此方法，先显示基础信息，再添加攻击力信息
    }
}

// 测试类
public class MinecraftTest {
    public static void main(String[] args) {
        // 创建生物对象
        PassiveMob cow = new PassiveMob("牛", 10, "皮革");
        PassiveMob sheep = new PassiveMob("绵羊", 8, "羊毛");
        HostileMob zombie = new HostileMob("僵尸", 20, 3);
        HostileMob creeper = new HostileMob("苦力怕", 15, 5);
        
        // 显示所有生物信息
        cow.displayInfo();
        sheep.displayInfo();
        zombie.displayInfo();
        creeper.displayInfo();
    }
}

