package pattern;

/**
 * Created by sould on 2016-01-18.
 */
public class SomeClass {

    private CallBack someCallBack;

    public SomeClass(CallBack someCallBack){
        this.someCallBack = someCallBack;
    }

    public void doSome(){
        String result = "hello CallBack";
        someCallBack.callBackMethod(result);
    }
}
