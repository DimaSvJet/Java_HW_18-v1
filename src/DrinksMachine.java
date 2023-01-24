public enum DrinksMachine {
    COFFEE(0,0,"Coffee"), TEA(0,0,"Tea"),
    LEMONADE(0,0,"Lemonade"), MOJITO(0,0,"Mojito"),
    MINERAL_WATER(0,0,"Mineral water"), COCA_COLA(0,0,"Coca-Cola"),
    DEFAULT(0,0, "We don't have this dink. Please try again!");

    final String drinks;
    int price;
    int quantity;
    int amount;

    private DrinksMachine( int price, int quantity, String drinks) {
        this.price = price;
        this.quantity = quantity;
        this.amount = quantity*price;
        this.drinks = drinks;
    }

    public String getDrinks() {
        return drinks;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        this.price = price;
        return price;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }


    @Override
    public String toString() {
        return "DrinksMachine{" +
                "drinks='" + drinks + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }

    public int getAmount() {
        this.amount = quantity*price;
        return amount;
    }



}






