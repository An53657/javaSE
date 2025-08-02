/*需求 调用一个方法求数组的最大值
throw： 写在方法的定义处，表明声明一个异常，告诉调用者，使用本方法可能会有哪些异常， 
throw： 写在方法内，结束方法，手动抛出异常对象，交给调用者，方法中下面不在执行了
 */
package Day26.a01exceptiondemo01.exceptiondemo01;

public class ExceptionDemo11 {
    public static void main(String[] args) {
        int[] arr = null;
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException n) {
            System.out.println("空指定异常");
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("索引越界");
        }

        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        // 手动创建异常对象，并把这个方法交给方法的调用者处理
        // 此时这个方法就结束，下面的代码就不会执行了
        if (arr == null) {
            throw new NullPointerException();
        }

        // 手动创建异常对象，并把这个方法交给方法的调用者处理
        // 此时这个方法就结束，下面的代码就不会执行了
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

    }
}
