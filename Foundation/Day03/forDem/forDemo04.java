/* 需求
 * 在实际开发中，如果要获取一个范围中的每一个数据时，也会用的循环
 */
package Day03.forDem;

public class forDemo04 {
    public static void main(String[] args) {
        //分析
        //1.循环1~5得到里面的每一个数字
        //开始条件是：1
        //结束语句是：5

        //定义一个变量
        int sum = 0;
        
        for(int i = 1;i <=10;i++){
            //System.out.println(i);
            //可以将得到的数字进行累加到变量sum中
            sum = sum + i; 

            //当循环结束之后，表示已经将1~5累加到sum当中
            System.out.println(sum);
        }
    }
}