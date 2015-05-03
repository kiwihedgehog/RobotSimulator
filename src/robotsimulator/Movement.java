package robotsimulator;

import java.util.ArrayList;

/**
 * The movement class will contain any calculations which are required to calculate a new position for the robot. This class largely relies on the map class and robot class.
 * @author masona11
 */
class Movement {
    int degreeDirection;
    private Robot myRobot;
    Map location;
    
    public int calculateRotation(int motorPowerRight, int motorPowerLeft) {
        int degreesToTurn; // place holder
        int forceDifference = 0;
        boolean right = true;
        
        if (motorPowerRight > motorPowerLeft){
            forceDifference = motorPowerRight - motorPowerLeft;
            right = false;
        }
        else if (motorPowerRight < motorPowerLeft) {
            forceDifference = motorPowerLeft - motorPowerRight;
            right = true;
        }
        else{degreesToTurn = 0;}
        degreesToTurn = (forceDifference * 90) / 100;
        
        
        return degreesToTurn;
    }

    public boolean isBetween(int x, int lower, int upper){
       boolean condition = true;
        
        return condition;
    }


    public void setDirection() {
        
    }

    public int turnRight(int degreesToTurn) {
        if((degreeDirection + degreesToTurn) > 360){
            degreeDirection += degreesToTurn - 360;
        }
        else{ degreeDirection += degreesToTurn; }
        return degreeDirection;
    }

    public void moveBackwards(int centimetres) {
         Map backwardLocation = myRobot.getRobotLocation();
         
       int newCoordinates;
       System.out.println(backwardLocation.getCardinalDirection());//testing
       // Uses the cardinal direction to establish which of its four degrees of movement it will take.
       switch(backwardLocation.getCardinalDirection()) {
           case "North":
              newCoordinates = backwardLocation.getyCoordinates() -  centimetres;
              backwardLocation.setyCoordinates(newCoordinates);
               break;
           case "East":
               newCoordinates = backwardLocation.getxCoordinates() - centimetres;
               backwardLocation.setxCoordinates(newCoordinates);
               break;
           case "South":
               newCoordinates = backwardLocation.getyCoordinates() + centimetres;
               backwardLocation.setyCoordinates(newCoordinates);
               break;
           case "West": 
               newCoordinates = backwardLocation.getxCoordinates() + centimetres;
               backwardLocation.setxCoordinates(newCoordinates);
               break;
       }
        
       myRobot.setRobotLocation(backwardLocation);
    }

    public int turnLeft(int degreesToTurn) {
         if(degreesToTurn <= degreeDirection){
        degreeDirection -= degreesToTurn;
        }
         else{degreeDirection = degreesToTurn - 360;}
        return degreeDirection;
    }

    public void moveForward(int centimetres) {
       Map forwardLocation = myRobot.getRobotLocation();
       int newCoordinates;
       
       // Uses the cardinal direction to establish which of its four degrees of movement it will take.
       switch(forwardLocation.getCardinalDirection()) {
           case "North":
              newCoordinates = forwardLocation.getyCoordinates() +  centimetres;
              forwardLocation.setyCoordinates(newCoordinates);
               break;
           case "East":
               newCoordinates = forwardLocation.getxCoordinates() + centimetres;
               forwardLocation.setxCoordinates(newCoordinates);
               break;
           case "South":
               newCoordinates = forwardLocation.getyCoordinates() - centimetres;
               forwardLocation.setyCoordinates(newCoordinates);
               break;
           case "West": 
               newCoordinates = forwardLocation.getxCoordinates() - centimetres;
               forwardLocation.setxCoordinates(newCoordinates);
               break;
       }
       
       myRobot.setRobotLocation(forwardLocation);
       
    }
    

    
    
    
    
    
   
}
