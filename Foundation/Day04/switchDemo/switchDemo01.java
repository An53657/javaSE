// // 这是一个Java程序，演示了如何使用switch语句进行条件判断
package Day04.switchDemo;

public class switchDemo01 {
    public static void main(String[] args) {
        // 兰州拉面 武汉热干面 北京炸酱面 陕西油泼面

        // 定义一个变量，表示心中想吃的面
        String noodles = "武汉热干面";
        // 拿这个面利用switch跟四种面进行匹配。
        switch (noodles) {
            case "兰州拉面":
                System.out.println("兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面");
                break;
            default:
                System.out.println("吃泡面");
                break;
        }
    }

}