package pattern;

/**
 * Created by sould on 2016-01-18.
 */
public class CallbackPattern {

    public static void main(String[] args) {
        CallbackPattern callbackPattern = new CallbackPattern();
        callbackPattern.test();
    }
    public void test(){
        SomeClass someClass = new SomeClass(someCallBack);
        someClass.doSome();
    }

    private CallBack someCallBack = new CallBack() {
        @Override
        public void callBackMethod(Object obj) {
            String result = (String)obj;
            System.out.println(result+"!!!!");
        }
    };
}


