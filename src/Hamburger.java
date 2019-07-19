public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private double price;

    private String additionalItem1Name;
    private double additionalItem1Price;

    private String additionalItem2Name;
    private double additionalItem2Price;

    private String additionalItem3Name;
    private double additionalItem3Price;

    private String additionalItem4Name;
    private double additionalItem4Price;

    public Hamburger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAdditional1(String name, double price){
        this.additionalItem1Name = name;
        this.additionalItem1Price = price;
    }

    public void addHamburgerAdditional2(String name, double price){
        this.additionalItem2Name = name;
        this.additionalItem2Price = price;
    }

    public void addHamburgerAdditional3(String name, double price){
        this.additionalItem3Name = name;
        this.additionalItem3Price = price;
    }

    public void addHamburgerAdditional4(String name, double price){
        this.additionalItem4Name = name;
        this.additionalItem4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.rollType + " roll - price is " + this.price);
        if(this.additionalItem1Name != null){
            hamburgerPrice += this.additionalItem1Price;
            System.out.println("Added " + this.additionalItem1Name + " for an extra " + this.additionalItem1Price);
        }
        if(this.additionalItem2Name != null){
            hamburgerPrice += this.additionalItem2Price;
            System.out.println("Added " + this.additionalItem2Name + " for an extra " + this.additionalItem2Price);
        }
        if(this.additionalItem3Name != null){
            hamburgerPrice += this.additionalItem3Price;
            System.out.println("Added " + this.additionalItem3Name + " for an extra " + this.additionalItem3Price);
        }
        if(this.additionalItem4Name != null){
            hamburgerPrice += this.additionalItem4Price;
            System.out.println("Added " + this.additionalItem4Name + " for an extra " + this.additionalItem4Price);
        }
        return hamburgerPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollType() {
        return rollType;
    }

    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
