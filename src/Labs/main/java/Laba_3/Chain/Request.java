package Laba_3.Chain;

public class Request {
    private String inputStream;

    public String getInputStream() {
        return inputStream;
    }

    public void setInputStream(String inputStream) {
        this.inputStream = inputStream;
    }

    public void appendToInputStream(String append) {
        this.inputStream += append;
    }
}