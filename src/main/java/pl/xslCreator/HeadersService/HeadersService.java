package pl.xslCreator.HeadersService;

import org.springframework.stereotype.Service;

@Service("Headers")
public class HeadersService implements Headers{

    private final static String RRS_CHANNEL_ITEM = "rrs/channel/item";
    private final static String ROOT_ITEM = "root/item";
    private final static String PRODUCTS_PRODUCT = "products/product";

    private String headers;

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    @Override
    public String addHeaders(String mapping) {
        return chooseHeaders(mapping);
    }

    private String chooseHeaders(String mapping){
        switch (mapping){
            case RRS_CHANNEL_ITEM -> {
                return headers = "test";
            } case PRODUCTS_PRODUCT, ROOT_ITEM -> {
                return headers = "test2";
            }
        }
        return null;
    }

}
