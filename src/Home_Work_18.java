import java.util.Scanner;

public class Home_Work_18 {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.print("Hello, we have the next drinks for you: " +
                "Coffee, " +
                "Tea, " +
                "Lemonade, " +
                "Mojito, " +
                "Mineral water and " +
                "Coca-Cola ");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        int totalAmount = 0;



        while (flag) {

            System.out.print("Please, write what would you like to drink: ");
            String drinksChoice = scanner.nextLine();
            String clietsOrder = drinksChoice.trim().toUpperCase();
            try { DrinksMachine drinks = DrinksMachine.valueOf(clietsOrder);}
            catch (IllegalArgumentException e){DrinksMachine drinks = DrinksMachine.DEFAULT;}
            DrinksMachine drinks;
            switch (clietsOrder) {
                case "COFFEE" -> {
                    Drinks yourCoffee = new Drinks(DrinksMachine.COFFEE);
                    yourCoffee.getDrinksCoffee(makeYourDrinks(yourCoffee));
                    System.out.println(yourCoffee);
                    totalAmount += yourCoffee.amountDrinks;
                    flag = nextDrinks();
                }
                case "TEA" -> {
                    Drinks yourTea = new Drinks(DrinksMachine.TEA);
                    yourTea.getDrinksTea(makeYourDrinks(yourTea));
                    System.out.println(yourTea);
                    totalAmount += yourTea.amountDrinks;
                    flag = nextDrinks();
                }
                case "LEMONADE" -> {
                    Drinks yourLemonade = new Drinks(DrinksMachine.LEMONADE);
                    yourLemonade.getDrinksLemonade(makeYourDrinks(yourLemonade));
                    System.out.println(yourLemonade);
                    totalAmount += yourLemonade.amountDrinks;
                    flag = nextDrinks();
                }
                case "MOJITO" -> {
                    Drinks yourMojito = new Drinks(DrinksMachine.MOJITO);
                    yourMojito.getDrinksMojito(makeYourDrinks(yourMojito));
                    System.out.println(yourMojito);
                    totalAmount += yourMojito.amountDrinks;
                    flag = nextDrinks();
                }
                case "MINERAL_WATER" -> {
                    Drinks yourMineral_water = new Drinks(DrinksMachine.MINERAL_WATER);
                    yourMineral_water.getDrinksMineral_water(makeYourDrinks(yourMineral_water));
                    System.out.println(yourMineral_water);
                    totalAmount += yourMineral_water.amountDrinks;
                    flag = nextDrinks();
                }
                case "COCA_COLA" -> {
                    Drinks yourCoca_cola = new Drinks(DrinksMachine.COCA_COLA);
                    yourCoca_cola.getDrinksCoca_cola(makeYourDrinks(yourCoca_cola));
                    System.out.println(yourCoca_cola);
                    totalAmount += yourCoca_cola.amountDrinks;
                    flag = nextDrinks();
                }
                default -> {
                    System.out.println("The drink is absent ");
                    flag = nextDrinks();
                }
            }

    }
        if (totalAmount > 0) {
                System.out.println("Amount payable: " + totalAmount);}
        else System.out.println("See you!");


   }
    private static int makeYourDrinks (Drinks yourDrinks) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, write how many quantity of " + yourDrinks.drinksMachine.getDrinks() +
                " do you want: ");
        return sc.nextInt();
    }


    private static boolean nextDrinks() {

        String nextDrinks;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Would you like to take next drinks? (YES/NO): ");
        nextDrinks = sc1.nextLine();
        return (nextDrinks.trim().toUpperCase()).equals("YES");
    }


}



