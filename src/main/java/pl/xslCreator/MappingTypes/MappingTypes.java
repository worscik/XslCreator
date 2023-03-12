package pl.xslCreator.MappingTypes;

public enum MappingTypes {
    RSS_CHANNEL_ITEM ("rss/channel/item"),
    ROOT_ITEM ("root/item"),
    PRODUCTS_PRODUCT ("products/product");

    String name;

    MappingTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
