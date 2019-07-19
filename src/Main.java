public class Main {

    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic","white","Sausage",4);
        HealthyBurger healthyBurger = new HealthyBurger("chicken");
        double price = healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAdditional1("cheddar cheese",1.50);
        healthyBurger.addHamburgerAdditional2("bacon",2);
        healthyBurger.addHamburgerAdditional3("tomato", 0);
        healthyBurger.addHamburgerAdditional4("onion", 0);
        healthyBurger.addAdditionalItem5("avocado",2);
        healthyBurger.addAdditionalItem6("spinach",1);
        price = healthyBurger.itemizeHealthyHamburger();
        System.out.println("Final price of your " + healthyBurger.getName() + " is $" + price);

        DeluxeBurger deluxeBurger = new DeluxeBurger("wheat", "beef");
        double deluxePrice = deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAdditional1("cheddar cheese",1.50);
        deluxeBurger.addHamburgerAdditional2("bacon",2);
        deluxeBurger.addHamburgerAdditional3("tomato", 0);
        deluxeBurger.addHamburgerAdditional4("onion", 0);
        deluxePrice = deluxeBurger.itemizeDeluxeBurger();
        System.out.println("Final price of your " + deluxeBurger.getName() + " is $" + deluxePrice);
    }
}
