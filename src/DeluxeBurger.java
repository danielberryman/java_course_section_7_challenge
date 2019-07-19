public class DeluxeBurger extends Hamburger {
    private String additionalItemD1Name;
    private double additionalItemD1Price;

    private String additionalItemD2Name;
    private double additionalItemD2Price;

    public DeluxeBurger(String rollType, String meat) {
        super("Deluxe", rollType, meat, 4.5);
        this.additionalItemD1Name = "chips";
        this.additionalItemD1Price = 1;
        this.additionalItemD2Name = "drink";
        this.additionalItemD1Price = 1.5;
    }

    public double getPrice() {
        return this.getPrice() + this.additionalItemD1Price + this.additionalItemD2Price;
    }

    public double itemizeDeluxeBurger() {
        double deluxeBurgerPrice = this.itemizeHamburger();
        System.out.println("Added " + this.additionalItemD1Name + " for an extra " + this.additionalItemD1Price);
        System.out.println("Added " + this.additionalItemD2Name + " for an extra " + this.additionalItemD2Price);
        return deluxeBurgerPrice += (this.additionalItemD1Price + this.additionalItemD2Price);
    }
}
