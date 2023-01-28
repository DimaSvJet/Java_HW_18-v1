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



        while (flag == true) {

            System.out.print("Please, write what would you like to drink: ");
            String drinksChoice = scanner.nextLine();
            String clietsOrder = drinksChoice.trim().toUpperCase();
            try { DrinksMachine drinks = DrinksMachine.valueOf(clietsOrder);}
            catch (IllegalArgumentException e){DrinksMachine drinks = DrinksMachine.DEFAULT;}
            DrinksMachine drinks;
            switch (clietsOrder) {
                case "COFFEE":
                    DrinksMachine yourCoffee = DrinksMachine.COFFEE;
                    makeYourDrinks(yourCoffee);
                    flag = nextDrinks();
                    break;

                case "TEA":
                    DrinksMachine yourTea = DrinksMachine.TEA;
                    makeYourDrinks(yourTea);
                    flag = nextDrinks();
                    break;

                case "LEMONADE":
                    DrinksMachine yourLemonade = DrinksMachine.LEMONADE;
                    makeYourDrinks(yourLemonade);
                    flag = nextDrinks();
                    break;

                case "MOJITO":
                    DrinksMachine yourMojito = DrinksMachine.MOJITO;
                    makeYourDrinks(yourMojito);
                    flag = nextDrinks();
                    break;

                case "MINERAL_WATER":
                    DrinksMachine yourMineral_water = DrinksMachine.MINERAL_WATER;
                    makeYourDrinks(yourMineral_water);
                    flag = nextDrinks();
                    break;

                case "COCA_COLA":
                    DrinksMachine yourCoca_cola = DrinksMachine.COCA_COLA;
                    makeYourDrinks(yourCoca_cola);
                    flag = nextDrinks();
                    break;

                default:
                    System.out.println("The drink is absent ");
                    flag = nextDrinks();
                    break;

            }
    }
        int totalAmount = 0;
        DrinksMachine [] listOfOrder = DrinksMachine.values();
        for (int i=0; i< (listOfOrder.length-1); i++){
            if (listOfOrder[i].getAmount() > 0) {
                totalAmount += listOfOrder[i].getAmount();
                System.out.println("Your order: " + listOfOrder[i]);
            }
        }
        System.out.println("Amount of the order: " + totalAmount);

    }
    private static void makeYourDrinks (DrinksMachine yourDrinks) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, write how many quantity of "+yourDrinks.getDrinks()+
                " do you want: ");
        int quantity = sc.nextInt();
        yourDrinks.setQuantity(quantity);
        int amount = yourDrinks.getAmount();
        int totalAmount = 0;
        totalAmount += amount;
        System.out.println(yourDrinks);
        System.out.println(amount);
    }

    private static boolean nextDrinks() {

        String nextDrinks;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Would you like to take next drinks? (YES/NO): ");
        nextDrinks = sc1.nextLine();
        if ((nextDrinks.trim().toUpperCase()).equals("YES")) return true;
        else return false;
    }


}



