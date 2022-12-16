import java.util.Random;

public class HomeWork_9 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] rugbyTeam1 = new int[25];
        int[] rugbyTeam2 = new int[25];
        int summTeam1 = 0, summTeam2 = 0;
        // Age team1
        for (int i = 0; i < rugbyTeam1.length; i++) {
            int randomAge = random.nextInt(22) + 18;
            rugbyTeam1[i] = randomAge;
            summTeam1 += rugbyTeam1[i];
            System.out.print(rugbyTeam1[i] + " ");
        }
        System.out.println(" ");
        //Age team2
        for (int i = 0; i < rugbyTeam1.length; i++) {
            int randomAge = random.nextInt(22) + 18;
            rugbyTeam2[i] = randomAge;
            summTeam2 += rugbyTeam2[i];
            System.out.print(rugbyTeam2[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Summ age of Team 1: "+summTeam1);
        System.out.println("Summ age of Team 2: "+summTeam2);

        //average age
        double averAgeTeam1 = (double) summTeam1 / rugbyTeam1.length;
        double averAgeTeam2 = (double) summTeam2 / rugbyTeam2.length;
        System.out.println("Average age of team 1: " + averAgeTeam1);
        System.out.println("Average age of team 2: " + averAgeTeam2);

    }
}
