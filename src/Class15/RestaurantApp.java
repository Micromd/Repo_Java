package Class15;

public class RestaurantApp {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("Technosoft Bistro",50);
        r1.checkSeatsLeft();
        r1.seatsParty();
        r1.removesParty();
        r1.restaurantSummary();
        r1.seatsParty();
        r1.seatsParty();
        r1.removesParty();
        r1.checkSeatsLeft();
        r1.restaurantSummary();


    }

}
