//这是判断第三个格式的练习, 要求：
//跟据不同分数送不同的礼物
//95~100分的，送自行车一辆。
//90~94分的，游乐场玩一天。
//80~89分的，变形金刚一个。
//80分以下的，帮父母做一天家务。

package Day04.ifDemo;

import java.util.Scanner;//导入java.util.Scanner类

public class ifDemoTestThree05 {
  public static void main(String[] args) {
    // 分析：
    // 1.键盘录入一个考试分数
    Scanner sc = new Scanner(System.in);// 创建一个Scanner对象，用于接收键盘输入
    System.out.println("请输入考试分数：");// 提示用户输入考试分数
    int score = sc.nextInt();// 接收用户输入的整数分数
    sc.close();// 关闭键盘录入，防止内存泄露。
    // 2.判断分数的范围
    // 数据合法性判断 0~100分
    if (score >= 0 && score <= 100) {// 判断分数是否在合法范围内
      if (score >= 95 && score >= 100) {// 判断分数是否在95~100之间
        System.out.println("送自行车一辆");// 输出送的礼物
      } else if (score >= 90 && score <= 94) {// 判断分数是否在90~94之间
        System.out.println("游乐场完一天");
      } else if (score >= 80 && score <= 89) {
        System.out.println("送变形金刚一个");
      } else if (score < 80) {
        System.out.println("帮父母做一天家务");
      }
    } else {
      System.out.println("输入的分数不合法，请重新输入！");// 输出提示信息
    }
  }
}
