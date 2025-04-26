/* 在实际开发中，需要重复执行代码，会选择循环实现
 * 比如，玩游戏的时候，如果网络不好经常断线重连
 * 那么断线重连这个业务逻辑就会重复执行
 * 假设现在公司要求 断线重连业务最多只写5次
 * 请用代码实现
 * 备注 断线重连业务可以用输出语句代替 
 */
package Day03.forDem;

public class forDemo03 {
    
    public static void main(String[] args) {
        //分析
        //1.因为我们需要重复执行某段代码，所以需要使用循环解决
        //循环次数5次
        //开始条件 1
        //结束条件 5 
        for(int i = 1 ;i <= 5;i++){
            System.out.println("重连中！！");
        }
        for(int i = 1;i <=5;i++){
            System.out.println("第" + i + "次重连中"); 
        }
    }
}
