package Class15;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Restaurant {

    String name;
    int guestCapacity;
    static int guestCount = 0;

    /**
     * Constructor-method that allows host open for services by passing restaurant name/guestCapacity
     */
    public Restaurant (String name1, int guestCapacity1){
        name = name1;
        guestCapacity = guestCapacity1;
    }

    /**
     * method that tells user if the seats are available
     */
    public void checkSeatsLeft (){
        int seatsLeft = guestCapacity - guestCount;
        System.out.println("There are " + seatsLeft + " seats available in the the restaurant");
    }

    /**
     * method that seatsParty
     */
    public void seatsParty (){
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter number of people coming");
            int partySize = scan.nextInt();
            guestCount = guestCount + partySize;
            if (guestCount>guestCapacity){
                guestCount = guestCount - partySize;
                System.out.println("Unfortunately, there are not enough seats available now, please wait.");
            } else{
                System.out.println("Please come in.");
            }
        }catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        checkSeatsLeft();
    }

    /**
     * method that removesParty
     */

    public void removesParty(){
            Scanner scan1 = new Scanner(System.in);
            try {
                System.out.println("Please enter number of people leaving");
                int partySize = scan1.nextInt();
                guestCount = guestCount - partySize;
                if (guestCount < 0) {
                    guestCount = guestCount + partySize;
                    System.out.println("Number of guest leaving is more than number of guests sitting. Please check and enter correct number.");
                } else {
                    System.out.println("Have a good night ");
                }
            }catch (InputMismatchException e) {
            System.out.println("Invalid input");
            }
            checkSeatsLeft();
    }




    /**
     * method that printsRestaurantSummary
     */
    public void restaurantSummary(){
        System.out.println("Name: " + name +
                "\nCurrent guest count: " + guestCount +
                "\nGuest capacity: " + guestCapacity);

    }

}
