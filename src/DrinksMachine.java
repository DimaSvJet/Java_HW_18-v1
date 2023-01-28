public enum DrinksMachine {
    COFFEE("Coffee"), TEA("Tea"),
    LEMONADE("Lemonade"), MOJITO("Mojito"),
    MINERAL_WATER("Mineral water"), COCA_COLA("Coca-Cola"),
    DEFAULT("We don't have this dink. Please try again!");

    final String drinks;
    private int price;


    private DrinksMachine(String drinks) {
        this.drinks = drinks;
    }


    public int setPrice(int price) {
        this.price = price;

        return price;
    }

    public String getDrinks() {
        return drinks;
    }



}







