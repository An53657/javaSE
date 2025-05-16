/* 需求 定义一个方法求，圆的面积 将结果在方法中打印
 * 定义一个带参数的方法格式
 * public static void 方法名(参数1，参数2,.....){..}
 * 调用格式
 * 方法名();
 */
package Day06.test;

public class Test02 {
    public static void main(String[] args) {
        //调用方法
     getArea(12);;
    }
    //定义一个带参数的方法
    public static void getArea(double radius){
    //计算圆的面积并打印
    double result = radius * radius * 3.14;
    System.out.println(result);
    }
}