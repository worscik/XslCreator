package pl.xslCreator.HeadersService;

import org.springframework.stereotype.Service;

@Service("Headers")
public class HeadersService implements Headers{

    private final static String RSS_CHANNEL_ITEM = "rss/channel/item";
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
            case RSS_CHANNEL_ITEM -> {
                return headers = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" version=\"1.0\"\n" +
                        "\t\txmlns:g=\"http://base.google.com/ns/1.0\">\n";
            } case PRODUCTS_PRODUCT, ROOT_ITEM -> {
                return headers = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" version=\"1.0\">\n";
            }
        }
        return null;
    }

}
