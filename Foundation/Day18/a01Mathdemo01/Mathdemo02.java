//  public static int        abs(int a)                  获取参数绝对值
//       public static double     ceil(double a )             向上取整
//       public static double     floor(double a)             向下取整
//       public static int        round(float)a               四舍五入
//       public static int        max  (int a , int b)        获取两个int值中的较大值
//       public static double     pow  (double a ,double b)   返回a的次幂的值
//       public static double     random()                    返回double的随机值，范围[0.0,1.0）
package Day18.a01Mathdemo01;

public class Mathdemo02 {
    public static void main(String[] args) {
        // 获取参数绝对值
        System.out.println(Math.abs(1));
        System.out.println(Math.abs(1));

        System.out.println("---------------------");

        // 向上取整
        System.out.println(Math.ceil(4.2));
        System.out.println(Math.ceil(4.7));
        System.out.println(Math.ceil(-4.7));
        System.out.println(Math.ceil(-4.2));

        System.out.println("---------------------");

        // 向下取整
        System.out.println(Math.floor(4.2));
        System.out.println(Math.floor(4.7));
        System.out.println(Math.floor(-4.7));
        System.out.println(Math.floor(-4.2));

        // 四舍五入
        System.out.println("---------------------");
        System.out.println(Math.round(4.2));
        System.out.println(Math.round(4.7));
        System.out.println(Math.round(-4.7));
        System.out.println(Math.round(-4.2));

        // 获取两个int值中的较大值
        System.out.println("---------------------");
        System.out.println(Math.max(2, 77));
        System.out.println(Math.max(1, 33));
        System.out.println(Math.max(-77, -1));
        System.out.println(Math.max(111, -123));

        // 返回a的次幂的值
        System.out.println("---------------------");
        System.out.println(Math.pow(4., 2));
        System.out.println(Math.pow(4, 100));
        System.out.println(Math.pow(1, -4));
        System.out.println(Math.pow(-7, -6));

        // 返回double的随机值，范围[0.0,1.0）
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println(Math.random());
        }
    }
}
