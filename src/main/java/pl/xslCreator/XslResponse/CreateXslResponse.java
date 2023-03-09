package pl.xslCreator.XslResponse;

import org.springframework.http.HttpStatus;
import pl.xslCreator.CreateXsl.CreateXslService;

public class CreateXslResponse {

    private String responseCode;
    private String xslFile;

    public CreateXslResponse(String responseCode, String xslFile) {
        this.responseCode = responseCode;
        this.xslFile = xslFile;
    }

    public CreateXslResponse(String responseCode) {
        this.responseCode = responseCode;
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
}
