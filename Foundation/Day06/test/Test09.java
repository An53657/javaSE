/* 需求 定一个方法copyOfrange (int[] arr int form, int to )
 * 功能 将数组arr中从索引from(包括from)开始
 * 到索引to结束(不包括to)的元素复制新的数组中
 * 将新数组返回
 */
package Day06.test;

public class Test09 {
    public static void main(String[] args) {
        //定义原始数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10,};
        //调用数组拷贝数据
        int[] copyArr  = copyOfrange(arr, 3,7);
        //遍历数组
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i] + " ");
        }
       
    }
    //定义方法
    //将数组arr中从索引from(包括from)开始,到索引to结束(不包括to)的元素复制新的数组中
    public static int[]  copyOfrange(int[] arr,int from,int to ){
        //打定义一个新数组
        int[] newArr = new int [to - from];
        //把原始数组arr中的from到to上的对应元素直接拷贝的newArr中
        int index = 0;
        for(int i = from;i < to;i++){
        newArr[index] = arr[i];
        index++;
        }
       return newArr;
    
}
}