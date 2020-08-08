import java.util.Random;
import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        System.out.println("Mi a jelszó?");
        
        Scanner input = new Scanner(System.in);
        String jelszo = input.next();

        System.out.println("Ezt írtad be jelszónak:"+jelszo);

        //Rossz megoldás
        if(jelszo == "Geri2006"){
            System.out.println("A jelszó helyes!");
        }else{
            System.out.println("A jelszó hibás!");
        }

        //Jó megoldás
        if(jelszo.equals("Geri2006")){
            System.out.println("A jelszó helyes!4");
        }else{
            System.out.println("A jelszó hibás!4");
        }

        input.close();

    }
}