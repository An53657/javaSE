/* 需求世界上最高的峰是珠穆朗玛峰(8444.43m=844430mm)，
 * 假如我有足够大的纸，它的厚度是0.1mm.
 * 请问，我叠多少次，会有折成珠穆朗玛峰的高度？
 */
package Day03.whileDemo;

public class while02 {
    public static void main(String[] args) {
        //1.定一个变量用来记录珠穆朗玛峰的高度

        double heigh= 8844430;

        //2.定一个变量记录纸张初始厚度
        double  paper = 0.1;
        //3.定义一个变量用来统计次数
        int count = 0 ;

        //4.循环折叠纸张，只要纸张厚度小于珠穆朗玛峰的高度循环继续。
        //每折一次 统计次数++
        //选择while理由:此时我们不知道循环的次数也不知道循环的范围，此时用while
        while(paper < heigh){
            //折叠纸张
            paper = paper * 2;

            //当循环结束时 count+1
            count ++;

        }
        //打印count
       System.out.println(count);


    }
    
}
