/*构造方法获取BigDecimal对象
  public BigDecimal (double val)
  public BigDecimal (String val)
 */
package Day18.a06BigDecimaldemo06;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        
        BigDecimal bd2 = new BigDecimal(0.09);

        
        System.out.println(bd2);

        //通过字符串的方式创建
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);

        //通过静态方法创建
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd6);



    }
}
