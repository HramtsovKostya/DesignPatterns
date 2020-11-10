package patterns.behavioral.templateMethod.pages;

import patterns.behavioral.templateMethod.WebsiteTemplate;

public class NewsPage extends WebsiteTemplate {

    @Override
    public void showPageContent() { System.out.println("News"); }
}