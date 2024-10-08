package espm.exceptions;

public class ESPMException extends RuntimeException {

    private final String code;

    public ESPMException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public ESPMException(String code, Throwable t, String msg) {
        super(msg, t);
        this.code = code;
    }

    public String code() {
        return code;
    }
    
}
