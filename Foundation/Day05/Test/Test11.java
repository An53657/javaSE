/* 需求
 * 定义两个变量，交互两个变量记录的值
 */
package Day05.Test;

public class Test11 {
    public static void main(String[] args) {
    //定义一个变量a
    int a = 0;
    int b = 1;
    //定义一个临时第三方变量
    //把a的值，赋值给temp
    int temp = a;
    //把b的值赋值给a
    a = b;
    //把temp的值赋值给b
    b = temp;
    System.out.println(a);
    System.out.println(b);
        
    }
}
