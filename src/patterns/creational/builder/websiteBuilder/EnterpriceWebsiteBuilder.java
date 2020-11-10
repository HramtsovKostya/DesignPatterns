package patterns.creational.builder.websiteBuilder;

import patterns.creational.builder.website.Cns;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder {
    @Override
    public void buildName() {
        website.setName("Enterprice");
    }

    @Override
    public void buildCns() {
        website.setCns(Cns.ALIFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(10000);
    }
}