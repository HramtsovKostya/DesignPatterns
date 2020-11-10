package patterns.creational.builder;

import patterns.creational.builder.website.Website;
import patterns.creational.builder.websiteBuilder.WebsiteBuilder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    public Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCns();
        builder.buildPrice();

        return builder.getWebsite();
    }
}