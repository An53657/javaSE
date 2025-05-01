/* 在实际开发中，没有程序一只循环，
 * 在循环的过程中，跳转的其他语句上执行
 */
package Day05.SkipIoopDemo;

public class SkipIoopDemo02 {
    public static void main(String[] args) {
        //跳转语句
        //跳转到某次循环
        // for循环公司及
        
        for(int i = 1; i <= 5;i++){
            if(i == 3 )
            //结束本次循环，进行下次循环
            continue;
            System.out.println("小老虎在吃" + i + "个");
        }
    }
}
