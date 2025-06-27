//进阶的敏感词替换
package Day10.StringDemo;

public class StringDemo13 {
    public static void main(String[] args) {
        // 获取说的话
        String take = "这次玩的比上次好,别送太多了,TMD";
        // 定义一个替换敏感词库
        String[] arr = { "TMD", "OI" };
        // 循环得到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            take = take.replace(arr[i], "***");
        }
        //打印结果
        System.out.println(take);
    }
}
