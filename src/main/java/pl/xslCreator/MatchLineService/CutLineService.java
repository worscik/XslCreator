package pl.xslCreator.MatchLineService;

import org.springframework.stereotype.Service;

@Service("CutLine")
public class CutLineService implements CutLine{

    private final static String RSS_CHANNEL_ITEM = "rss/channel/item";
    private final static String ROOT_ITEM = "root/item";
    private final static String PRODUCTS_PRODUCT = "products/product";

    private String cutLine;

    @Override
    public String setLineToCut(String mapping, boolean isCustom) {
        return isCustom ? customCut(mapping) : standardCut(mapping);
    }

    private String standardCut(String mapping){
        switch (mapping){
            case RSS_CHANNEL_ITEM -> {
               return cutLine = "<xsl:template match=\"rss/channel/title | rss/channel/link | rss/channel/description\" />\n ";
            } case ROOT_ITEM,PRODUCTS_PRODUCT -> {
                return cutLine = null;
            }
        }
        return null;
    }

    private String customCut(String mapping){
        return "Not ready yet!.";
    }



}
