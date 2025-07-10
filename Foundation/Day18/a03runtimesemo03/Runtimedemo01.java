package Day18.a03runtimesemo03;

public class Runtimedemo01 {
    public static void main(String[] args) {

        // 方法名 说明
        // public static Runtime getRuntime() 当前系统环境运行对象
        // public void exit (int static) 停止虚拟机
        // public int availableProcessoors() 获取CPU线程数
        // public log maxMemory JVM能从系统中获取总内存大小(单位 byte字节)
        // public log totalMemory JVM能已经从系统中获取总内存大小(单位 byte字节)
        // public log freeMemory JVM剩余内存大小(单位 byte字节)
        // public Process exec (string comand) 运行cmd命令

        // public static Runtime getRuntime() 当前系统环境运行对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1 == r2);

        // //public void exit (int static) 停止虚拟机
        // r1.exit(1);
        // System.out.println("看看我执行了吗");

        // public int availableProcessoors() 获取CPU线程数
        int u = r1.availableProcessors();
        System.out.println(u);

        // public log maxMemory JVM能从系统中获取总内存大小(单位 byte字节)
        long w = r1.maxMemory();
        System.out.println(w / 1024 / 1024 / 1024);

        // public log totalMemory JVM能已经从系统中获取总内存大小(单位 byte字节)
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        // public log freeMemory JVM剩余内存大小(单位 byte字节)
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        // public Process exec (string comand) 运行cmd命令

    }

}
