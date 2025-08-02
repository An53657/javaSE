package Day26.a01exceptiondemo01.exceptiondemo03;

public class NameFormatException extends RuntimeException {
    // nameFormat 当前异常的名字，表示姓名格式的问题
    // xception 表示当前的异常类

    // 运行时异常 RuntimeException 核心 ：由于参数错误而导致的问题
    // 编译时异常 Exception ：提醒程序员检查本地信息

    public NameFormatException() {

    }

    public NameFormatException(String message){
        super(message);
    }
}
