//需求： 定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串返回，调用该方法，在控制台输出结果。拼接字符串
//例如：数组为 int [] arr = {1,2,3};
//执行方法输出结果为 [1,2,3]
package Day10.stringdemo;

public class StringDemo07 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, };
        String str = arrToString(arr);
        System.out.println(str);
    }

    // 定义一个方法，用于字符串拼接
    public static String arrToString(int[] arr) {
        // 定义一个方法
        // 问自己三个问题
        // 我要干嘛
        // 我干这件事需要什么才能完成
        // 我干完了是否要把结果返回给调用处
        // 如果调用处需要继续使用 那么必须返回
        // 如果调用处需不继续使用 那么可以返回可以不返回

        // 传入的字符串进行校验

        if (arr == null) {
            // 如果数组传过来是null,那么返回一个长度为0的数组 """
            return "";
        }

        if (arr.length == 0) {
            // 如果传过来的是数组为0 那么返回 表示这里什么都没有
            return "[]";
        }

        // 判断结束；有内容的数组

        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                // 如果说是最后一个元素，那么就拼接元素就行
                result = result + arr[i];
            } else {
                // 如果不是最后一个元素 那么就拼接元素再拼接逗号空格
                result = result + arr[i] + ", ";
            }
        }

        // 当循环结束后 在拼接""]"

        result = result + "]";

        // 返回字符串到调用处
        return result;
    }
}
