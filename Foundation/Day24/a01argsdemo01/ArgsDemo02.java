package Day24.a01argsdemo01;

public class ArgsDemo02 {
    public static void main(String[] args) {
        // 在以计算n个数据求和
        int[] arr = {1,2,3,4,5,6,7,8,9,12,33,77,99,778};
        int sum =  getSum(arr);
        System.out.println(sum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }
}
