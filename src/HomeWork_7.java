import java.util.Random;
import java.util.Scanner;

public class HomeWork_7 {
    public static void main(String[] args) {
        int counter = 0;
        boolean flagWinner = false;
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        while (counter < 3) {
            switch (counter) {
                case 0:
                    System.out.println("Перша спроба!");
                    break;
                case 1:
                    System.out.println(" ");
                    System.out.println("Друга спроба!");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Третя спроба! Остання!");
                    break;
            }
            counter++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Уведіть число від 0 до 10");
            int tryNumber = scanner.nextInt();
            if (tryNumber > randomNumber) {
                System.out.println("Ваше чило завелике");
            } else if (tryNumber < randomNumber) {
                System.out.println("Ваше число замале");
            } else {
                System.out.println("Ви вгадали! Молодець!");
                flagWinner = true;
                break;
            }
        }
        if (flagWinner == true) {
            System.out.println("Переможець! Гру закінчено.");
        } else {
            System.out.println("Вірна відповідь: "+randomNumber);
            System.out.println("На жаль Ви програли... Гру закінчено. Спробуй йще!");
        }
        }
}
