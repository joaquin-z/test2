package test2;

public class C32 {
    
    public String mA() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

}
