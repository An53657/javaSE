
package Day18.a02systemdemo02;

public class Systemdemo03 {
    public static void main(String[] args) {
        // public static void arraycopy(数据源数组，起始索引，目的地索引，起始索引，拷贝个数) 拷贝数组

        // 创建数组
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 33, 88, 99, };
        int[] arr2 = new int[16];
        System.arraycopy(arr1, 0, arr2, 0, 3);

        // 验证
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);

        }

    }
}
