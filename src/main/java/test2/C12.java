package test2;

public class C12 {
    
    public String mA() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

}
