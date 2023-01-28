public class Drinks {

   final int priceCoffee = 50;
   final int priceTea = 35;
   final int priceLemonade = 45;
   final int priceMojito = 25;
   final int priceMineral_water = 25;
   final int priceCoca_cola = 40;

   public DrinksMachine drinksMachine;

   public DrinksMachine drinksCoffee = DrinksMachine.COFFEE;
   public DrinksMachine drinkTea = DrinksMachine.TEA;
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

   public void setPrice(int price) {
      this.price = price;
   }

   public Drinks(DrinksMachine drinksMachine, int quantity, int price,int amountDrinks) {
      this.drinksMachine = drinksMachine;
      this.quantity = quantity;
      this.setPrice(price);
      this.amountDrinks = amountDrinks;
   }

   public int totalAmount (int amount){
      amountDrinks += amountDrinks;
      return amountDrinks;
   }


   }



