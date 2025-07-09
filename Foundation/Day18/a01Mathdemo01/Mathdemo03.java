//判断一个数是否为水仙花数
package Day18.a01Mathdemo01;

public class Mathdemo03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            double sun = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sun == i) {
                count++;
                // System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
