/*  需求
 * 定一个数组，存储1,2,3,3,4,5,6,7,8,9.10
 * 遍历数组的每一个元素，统计数组里面有多少个能被3整数的数
 */
package Day05.Text;


public class arrTest02 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr ={1,2,3,3,4,5,6,7,8,9,10};
        //统计
        int count = 0;
        //遍历数组
        for(int i = 0;i < arr.length;i++ ){
            //i 表示数组里面的每一个索引
            //arr[i] 表示数组里面的每一个元素
            //System.out.println(arr[i]);
            //判断多少能呗整除的
        if(arr[i] % 3 ==0){
            //System.out.println(arr[i]);
          count++;
          }
        }
        System.out.println("能被3整除的有" + count + "个");
    }
}
