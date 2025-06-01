/* 数组遍历
 * 
 */
package Day05.arrayDeno;

public class arrayDemo03 {
  public static void main(String[] args) {
    // 定义一个数组
    int[] arr = { 1, 2, 3 };
    // 获取数组里的所有元素
    // 格式 数组名[索引];
    // System.out.println(arr[0]);
    // System.out.println(arr[1]);
    // System.out.println(arr[2]);

    // 用循环
    // 开始条件：0
    // 结束条件：数组长度-1 (最大索引)
    // for(int i = 1;i <=3;i++){
    // System.out.println(arr[i]);
    // }

    // 在java当中，关于数组的长度属性可以用(.length)
    // 调用方法 数组名.length
    // System.out.println(arr.length);

    // 开始条件1
    // 结束条件arr.lenght
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    // 扩展
    // 数组名.fori
    // for (int arr2 = 0; arr2 < arr.length; arr2++) {
    //
    // }
  }
}
