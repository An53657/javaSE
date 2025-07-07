package Day14.a03finaldemo03;

public  class Fu {
    // 1. final修饰方法：表示最终方法，不能被重写。
    public   void show() {
        System.out.println("父类的show方法");
    }

    /*
     * 结论：
     * final修饰的方法不能被子类重写的 最终写法
     * 什么时候用的呢？
     * 一般来讲，如果说当前方法，它时一种规则，这个规则不希望被别人改变
     * 这个方法，就建议用final来修饰。
     * 所以凡是不想被别人改变的方法都用final修饰
     */



     //2.  final修饰类： 表示最终类，不能被修改。
     // 它是没有儿子的
     


     //3. 修饰变量： 表示常量，只能赋值一次，不能被修改。
}
