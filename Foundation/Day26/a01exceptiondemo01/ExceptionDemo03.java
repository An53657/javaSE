/*
- 作用一：异常用于查询bug的关键参考信息
- 作用二：异常可以可以作为方法内部的一种特殊的返回值，以便通知调用者底层的执行情况
 */
package Day26.a01exceptiondemo01;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        // - 作用二：异常可以可以作为方法内部的一种特殊的返回值，以便通知调用者底层的执行情况
        Stundent stu = new Stundent();
        stu.setAge(50);
    }
}
