package Day26.a01exceptiondemo01.exceptiondemo03;

public class AgeIndexOutOfBoundsException extends RuntimeException {
    public AgeIndexOutOfBoundsException(){}

    public AgeIndexOutOfBoundsException(String message){
        super(message );
    }
}
