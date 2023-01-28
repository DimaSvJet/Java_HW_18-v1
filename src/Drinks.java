public class Drinks {

   final int priceCoffee = 50;
   final int priceTea = 35;
   final int priceLemonade = 45;
   final int priceMojito = 25;
   final int priceMineral_water = 25;
   final int priceCoca_cola = 40;


   public DrinksMachine drinksMachine;

   public DrinksMachine drinksCoffee = DrinksMachine.COFFEE;
   public DrinksMachine drinksTea = DrinksMachine.TEA;
   public DrinksMachine drinksLemonade = DrinksMachine.LEMONADE;
   public DrinksMachine drinksMojito = DrinksMachine.MOJITO;
   public DrinksMachine drinksMineral_water = DrinksMachine.MINERAL_WATER;
   public DrinksMachine drinksCoca_Cola = DrinksMachine.COCA_COLA;
   public DrinksMachine noChoiсe = DrinksMachine.DEFAULT;

   int quantity;
   int price;
   int amountDrinks;

   public int getPriceCoffee() {
      return priceCoffee;
   }

   public int getPriceTea() {
      return priceTea;
   }

   public int getPriceLemonade() {
      return priceLemonade;
   }

   public int getPriceMojito() {
      return priceMojito;
   }

   public int getPriceMineral_water() {
      return priceMineral_water;
   }

   public int getPriceCoca_cola() {
      return priceCoca_cola;
   }



   public Drinks(DrinksMachine drinksMachine) {
      this.drinksMachine = drinksMachine;
      setQuantity(quantity);
      drinksMachine.setPrice(price);
      this.amountDrinks = quantity*price;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public void getDrinksCoffee(int quantity) {
      this.quantity = quantity;
      this.price = drinksCoffee.setPrice(priceCoffee);
      this.amountDrinks = quantity*price;
   }

   public void getDrinksTea(int quantity) {
      this.quantity = quantity;
      this.price = drinksTea.setPrice(priceTea);
      this.amountDrinks = quantity*price;
   }
   public void getDrinksLemonade(int quantity) {
      this.quantity = quantity;
      this.price = drinksLemonade.setPrice(priceLemonade);
      this.amountDrinks = quantity*price;
   }
   public void getDrinksMojito(int quantity) {
      this.quantity = quantity;
      this.price = drinksMojito.setPrice(priceMojito);
      this.amountDrinks = quantity*price;
   }
   public void getDrinksMineral_water(int quantity) {
      this.quantity = quantity;
      this.price = drinksMineral_water.setPrice(priceMineral_water);
      this.amountDrinks = quantity*price;
   }
   public void getDrinksCoca_cola(int quantity) {
      this.quantity = quantity;
      this.price = drinksCoca_Cola.setPrice(priceCoca_cola);
      this.amountDrinks = quantity*price;
   }


   @Override
   public String toString() {
      return "Your order {" +
              "drinks=" + drinksMachine.drinks +
              ", quantity=" + quantity +
              ", price=" + price +
              ", amountDrinks=" + amountDrinks +
              '}';
   }
}



