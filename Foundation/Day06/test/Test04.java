/* 需求 定一个方法，求长方形的周长，将结果在方法中进行打印
 * 目标 根据不同的需求选择定义无参的方法 还是带参的方法
 * 格式
 * public static void 方法名(参数1,参数2,....){}
 * 调用格式
 * 方法名(变量1，变量2);
 */
package Day06.test;

public class Test04 {
    public static void main(String[] args) {
        //调用
        getLength(15, 7.230);
    }
    //定义方法
    public static void getLength(double len, double width){
        //计算长方形的周长，并打印
            double result = (len + width) * 2;
            System.out.println(result);
    }
}
