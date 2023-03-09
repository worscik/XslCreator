package pl.xslCreator.XslResponse;

import org.springframework.http.HttpStatus;
import pl.xslCreator.CreateXsl.CreateXslService;

public class CreateXslResponse {


    private String responseCode;
    private String xslFile;
    private boolean isSucces;
    private String errMessage;

    public CreateXslResponse(String responseCode, boolean isSucces, String errMessage) {
        this.responseCode = responseCode;
        this.xslFile = xslFile;
        this.isSucces = isSucces;
        this.errMessage = errMessage;
    }

    public CreateXslResponse(String responseCode, String xslFile, boolean isSucces) {
        this.responseCode = responseCode;
        this.xslFile = xslFile;
        this.isSucces = isSucces;
    }
    public CreateXslResponse() {
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getXslFile() {
        return xslFile;
    }

    public void setXslFile(String xslFile) {
        this.xslFile = xslFile;
    }

    public boolean isSucces() {
        return isSucces;
    }

    public void setSucces(boolean succes) {
        isSucces = succes;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
