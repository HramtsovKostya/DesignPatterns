package patterns.creational.builder.websiteBuilder;

import patterns.creational.builder.website.Website;

public abstract class WebsiteBuilder {
    Website website;

    public void createWebsite() {
        website = new Website();
    }

    public abstract void buildName();
    public abstract void buildCns();
    public abstract void buildPrice();

    public Website getWebsite() {
       return website;
    }
}