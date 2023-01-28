public enum DrinksMachine {
    COFFEE("Coffee"), TEA("Tea"),
    LEMONADE("Lemonade"), MOJITO("Mojito"),
    MINERAL_WATER("Mineral water"), COCA_COLA("Coca-Cola"),
    DEFAULT("We don't have this dink. Please try again!");

    final String drinks;


    private DrinksMachine(String drinks) {
        this.drinks = drinks;
    }

    public String getDrinks() {
        return drinks;
    }



}






