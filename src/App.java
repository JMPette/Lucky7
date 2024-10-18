import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Integer money=4;
        Integer round =1;
        Integer num1;
        Integer num2;
        Integer num3;
        Integer sevencount=0;
        Integer winnings;
        Integer calcW1;  
             

        do {

            num1 = random.nextInt(10)+1;
            num2 = random.nextInt(10)+1;
            num3 = random.nextInt(10)+1;

            if (num1 == 7) sevencount++;
            if (num2 == 7) sevencount++;
            if (num3 == 7) sevencount++; 

                if (sevencount == 3) {
                    calcW1 = 7;
                } else if (sevencount == 2) {
                    calcW1 = 5;
                } else if (sevencount == 1) {
                    calcW1 = 3;
                } else {
                    calcW1 = 0;
                }
            System.out.println("Arvotut numero on " + num1 + "," + num2 + "," + num3);
            //winnings = calcW1(num1, num2, num3);
            money -= round;

            

            winnings = (calcW1 ) ;

            if (winnings >0){
            System.out.println("Voitit " + winnings + "!");
            //winnings = 0;
            //money = (money + winnings);
            
            }
            else{
                System.out.println("Hävisit!");
            }

            
            
            
        }

        while (money >= 0); {
    

    System.out.println("Rahat loppuivat. Peli päättyy.");
}   scanner.close();
}    
}
