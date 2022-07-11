package practice.ex.chapter8;

public class Chapter8_9 {
    public static void main(String[] args) {

        try {
            throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
        } catch (UnsupportedFunctionException e) {
            e.printStackTrace();
        }
    }
}

class UnsupportedFunctionException extends RuntimeException {
    final private int ERR_CODE;

    UnsupportedFunctionException(String message, int ERR_CODE) {
        super(message);
        this.ERR_CODE = ERR_CODE;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }
    @Override
    public String getMessage() {
        return "[" + ERR_CODE + "]" + super.getMessage();
    }
}
