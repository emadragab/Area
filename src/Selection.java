import java.util.Random;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        int firstnum = (int)(Math.random() * 10);
        int secondnum= (int)(Math.random() * 10);
        // get answer
        Scanner scanner = new Scanner(System.in);
        if(firstnum < secondnum){
            int swap=firstnum;
                firstnum = secondnum;
                secondnum =swap;
        }
        System.out.println("what is "+ firstnum +" - "+secondnum + "?" );
        int answer = scanner.nextInt();
        if(answer == (firstnum - secondnum)){

            System.out.println("Correct, Well done ");
        }else {

            System.out.println("Hmmmm , try agian ");

        }


    }
}