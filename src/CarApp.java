import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by williamdonaldson on 2/16/17.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Detroit's Grand Circus Admin Console! ");
        //
        System.out.println();
        //
        System.out.println("How many cars are you interested in learning about? ");
        int numCars = scan.nextInt();

        String input;

        //create the ArrayList (empty for now)
        ArrayList<Car> carList = new ArrayList<Car>();
        //The important questions
        for (int i = 0; i < numCars; i++) {
            //get the info
            System.out.print("What is the Make of the vehicle? ");
            String make = scan.next();

            System.out.print("What is the Model type? ");
            String model = scan.next();

            System.out.print("What year is the vehicle? ");
            int year = scan.nextInt();

            System.out.print("How much are you willing to spend of this vehicle?  ");
            double price = scan.nextDouble();

            //Create a new instance
            Car u = new Car(make, model, year, price);

            //add it to the ArrayList
            carList.add(u);
        }
        System.out.println(" ");
        System.out.println("Thank You! " + " ...");
        System.out.println("Current Inventory: ");
        System.out.println();
        //go through the users
        for (Car u : carList) {
            //and output them
            System.out.println(u);
            System.out.println(); //skip a line
        }
    }
}
