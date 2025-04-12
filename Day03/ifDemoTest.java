package Day03;

public class  ifDemoTest {
    public static void main(String[] args) {
        //盘点红绿灯
        //汽车无人驾驶，用到大量判断。
        //当汽车遇到红绿灯时，进行判断
        //如果红灯，就停止
        //如果黄灯，就减行
        //如果绿灯，就行

        //定义三个变量
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;
        //true 亮  false 灭
        //判断
        if (isLightGreen) {
            System.out.println("gogogo");
        }else if (isLightYellow) {
            System.out.println("slow");
        }else if (isLightRed) {
            System.out.println("stop");
        }
        //if语句的执行顺序是从上到下，依次判断
        //当满足条件时，if语句就结束了，后面的就不再判断
    }
}
