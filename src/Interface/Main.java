/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Walking walk = new Walking();
        roundTrip(walk, 10);
    }
    public static void roundTrip(CanTravel trip, double dist){
        System.out.println("Leaving . . . . ."); 
       double firstTravel = trip.move(dist);
        System.out.println("Returning . . . . . .");
        double returnTravel = trip.move(dist);
        double tripTime = firstTravel + returnTravel;
        System.out.println("Total travel time: " + tripTime + " Hours");
    }
    
}
