/* 需求  
 * 定义一个数组，存入1~5 要求打乱数组中所有数据中的顺序
 */
package Day05.Test;
import java.util.Random;
public class Test14 {
    public static void main(String[] args) {
        //用静态初始化创建数组
        int[] arr = {1,2,3,4,5};
        //循环遍历数组从0开始打乱顺序
        //用Random这个类
        Random r = new Random();
        for(int i = 0;i < arr.length;i++){
            //生成一个随机索引
            int randomIdex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = randomIdex;
            arr[randomIdex] = temp;
        }
        //当循环结束了，数组里的数据就被打乱了
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
}
}
