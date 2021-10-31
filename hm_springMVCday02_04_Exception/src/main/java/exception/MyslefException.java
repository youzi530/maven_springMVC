package exception;

/**
 * 自定义异常类
 */
public class MyslefException extends Exception {

    private String message;

    public MyslefException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
