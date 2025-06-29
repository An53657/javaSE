//需求 用StringBuilder来拼接字符串 定义一个方法 把int 数组中的数据按照指定的格式拼接成一个字符串
//并返回 调用该方法 在控制台输出打印
//例如数组 int [] arr -= {1,2,3};
//执行方法后输出 [1,2,3]
package Day10.stringbuilderdemo;

public class StringBuilderDemo06 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = { 1, 2, 3 };
        String result = getToString(arr);
        System.out.println(result);

    }

    // 定义方法
    public static String getToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
