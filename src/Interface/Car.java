/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ramsey.kerley
 */
public class Car implements CanTravel {

    private double speed = 60;

    @Override
    public double move(double miles) {

        double travelTime = miles / speed;
        System.out.println("Plane travels: " + miles + " miles");
        System.out.println("It takes: " + travelTime + " Hours");
        return travelTime;
    }

}
