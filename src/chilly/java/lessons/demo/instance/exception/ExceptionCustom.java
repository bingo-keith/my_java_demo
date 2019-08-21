package chilly.java.lessons.demo.instance.exception;

@SuppressWarnings("serial")
class WrongInputException extends Exception {  // 自定义的类
    WrongInputException(String s) {
        super(s);
    }
}

class Input {
    void method() throws WrongInputException {
        throw new WrongInputException("Wrong input"); // 抛出自定义的类
    }
}

public class ExceptionCustom {

    public static void main(String[] args){
        try {
            new Input().method();
        }
        catch(WrongInputException wie) {
            System.out.println(wie.getMessage());
        }
    }

}
