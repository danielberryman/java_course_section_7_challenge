public class HealthyBurger extends Hamburger {
    private String additionalItem5Name;
    private double additionalItem5Price;

    private String additionalItem6Name;
    private double additionalItem6Price;

    public HealthyBurger(String meat) {
        super("Healthy", "brown rye bread", meat, 5);
    }

    public void addAdditionalItem5(String name, double price){
        this.additionalItem5Name = name;
        this.additionalItem5Price = price;
    }

    public void addAdditionalItem6(String name, double price){
        this.additionalItem6Name = name;
        this.additionalItem6Price = price;
    }

    public double itemizeHealthyHamburger() {
        double healthyHamburgerPrice = this.itemizeHamburger();
        if(additionalItem5Name != null) {
            healthyHamburgerPrice += additionalItem5Price;
            System.out.println("Added " + this.additionalItem5Name + " for an extra " + this.additionalItem5Price);
        }
        if(additionalItem6Name != null) {
            healthyHamburgerPrice += additionalItem6Price;
            System.out.println("Added " + this.additionalItem6Name + " for an extra " + this.additionalItem6Price);
        }
        return healthyHamburgerPrice;
    }

    public double getPrice(){
        return this.getPrice();
    }
}
