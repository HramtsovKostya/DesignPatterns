package patterns.creational.builder.website;

public class Website {
    private String name;
    private Cns cns;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCns(Cns cns) {
        this.cns = cns;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cns=" + cns +
                ", price=" + price +
                '}';
    }
}