package pl.xslCreator.XslResponse;

public enum ResponseCode {
    START("Ok"),
    SUCCES("Success, the file was successfully created"),

    ERROR("404");

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
