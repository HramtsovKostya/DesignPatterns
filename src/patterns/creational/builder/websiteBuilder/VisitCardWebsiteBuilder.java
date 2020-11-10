package patterns.creational.builder.websiteBuilder;

import patterns.creational.builder.website.Cns;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Visit card");
    }

    @Override
    public void buildCns() {
        website.setCns(Cns.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        website.setPrice(500);
    }
}