/* 练习*/
package Foundation.Day22.genericdemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

    }

    // 需求1 该方法能养所有品种的猫，但是不能养狗
    public static void KeepPet1(ArrayList<? extends Cat> list) {
        // 遍历集合
    }

    // 需求2 该方法能养所有品种的狗，但是不能养猫
    public static void KeepPet2(ArrayList<? extends Dog> list) {
        // 遍历集合
    }

    // 需求3 该方法能养所有品种的动物，但是不能传递其他
    public static void KeepPet3(ArrayList<? extends Animal> list) {
    }
}
