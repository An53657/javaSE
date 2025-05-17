/* 需求 设计一个方法求数组的最大值 并将数组的最大值返回
 * 
 */
package Day06.test;

public class Test07 {
    public static void main(String[] args) {
        //定一个一个数组
        int[] arr = {1 ,2 ,3, 44 ,66,6654};

        //调用方法
        int max = getMax(arr);
        System.out.println(max);
    }
    //定义一个数组 求数组的最大值
    //我要干什么？ 求数组的最大值
    //我干这件事需要什么？ 数组
    //要不要返回值 ？需要
    public static int getMax(int[] arr){
        //定义一个参照物
        int max = arr[0];

        for(int i = 1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            }
            return max;
        }
    }
    
