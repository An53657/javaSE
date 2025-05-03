/* 需求
 * 定义一个数组求最大值：33，5，22，44，55
 * 扩展问题
 * 1.根据求最大值思路，改写求最小值
 * 2.为什么MAX记录arr[0】，默认不能未0吗
 * 不能
 * MAX初始化的值一定是数组里的值
 * 3.循环开始条件不一定是0
 * */
package Day05.arrayDeno;

public class ArrayDemo04 {
    public static void main(String[] args) {
        //定义一个数组
        //已经知道了元素的个数，用静态初始化
        int[] arr ={33,5,22,44,55};

        //定义一个变量表示最大值
        int MAX =arr[0]; 
        //遍历数组
        for(int i = 0;i< arr.length;i++){
        //i 表示数组里的每一个索引
        //[i] 依次表示数组里的每一个元素
        if(arr[i] > MAX){
             MAX = arr[i];
        }        
        }
        //当循环·结束时 MAX就是记录的最大值
        System.out.println("最大值是" + MAX);
    }
}
