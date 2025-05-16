/* 目标 要能区分什时候需要用到返回值的方法
 *  需求 定义方法 比较两个长方形面积
 */
package Day06.Method;

public class MethodDemo07 {
    public static void main(String[] args) {
        //调用方法并进行比较
        double area0 = getArea(20.3 ,15);
        double area1 = getArea(15,29.3);
        if(area0 > area1){
            System.out.println("定一个长方形更大");
        }else {
            System.out.println("第二个长方形更大");
        }

    }
    //定义方法 求长方形的·面积
    //1.我要干什么？比较两个长方形的面积
    //2.需要什么？长 和 宽
    //3.方法调用出 是否继续使用方法的结果
    //如果要用 那么方法必须要有返回值
    //如果不用 方法会有不写返回值 也可以写返回值
    public static double getArea(double len, double width){
        double area = len * width;
        return area;
    }
}
