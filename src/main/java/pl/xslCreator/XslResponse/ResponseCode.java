package pl.xslCreator.XslResponse;

public enum ResponseCode {

    FALSE("False"),
    OK("OK"),
    SUCCES("Xsl file created.");

    private String desc;

    ResponseCode(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
