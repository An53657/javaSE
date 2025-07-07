package Day14.a04codeblockdemp04.codeblockdemo02;

public class CodeBlockDemo01 {
    public static void main(String[] args) {
        // // 局部代码块
        // {
        // int a = 10;
        // } // 因为当代码执行到这里是变量a就从内存里消失了
        // // System.out.println(a);
        // Stundent s = new Stundent("null", 23);
        // System.out.println(s.getName() );

        Stundent s   = new Stundent();
        
        Stundent ss = new Stundent("张三", 23);
        System.out.println( s);
        System.out.println(ss);
    }
}
