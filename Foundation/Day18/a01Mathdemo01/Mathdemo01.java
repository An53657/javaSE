// 判断一个数是否为质数

package Day18.a01Mathdemo01;

public class Mathdemo01 {

    public static void main(String[] args) {

        System.out.println(isPirme(997));
    }

    public static boolean isPirme(int number) {
        int count = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
