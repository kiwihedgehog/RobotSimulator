package robotsimulator;

import java.util.ArrayList;

/**
 *
 * This class knows how to execute commands and deal with user related issues in terms of commands.
 * @author masona11
 */
class Commands {
    private ArrayList timeQeue = new ArrayList();
    private ArrayList<String> commandList = new ArrayList();
    final private ArrayList<String> instructionList = new ArrayList();
    private int degreesToTurn;
    private int waitTime;
    private int forwardDistance;
    private int backwardsDistance;
    private double centimetres;
    private Movement moveToLocation;
    private Robot myRobot;
    
    
    public Commands() {
        instructionList.add("forward - Moves the robot forward at default motor speed.");
        instructionList.add("backward - Moves the robot back at a default motor speed.");
        instructionList.add("left - Turns the robot left at the current set speed.");
        instructionList.add("right - Turns the robot right at the current set speed.");
        instructionList.add("wait - Commands the robot to wait for a set period of time.");
        instructionList.add("go - Starts the simulation after commands are entered.");
        instructionList.add("exit - Exits the Robot Simulator.");
    }
    //Methods implemented here in the commands class for later expansion of command utility and structure.    
    public void left (int degrees) {
     int finalFace = moveToLocation.turnLeft(degrees);
     
    }
    
    public void right(int centimetres){
            moveToLocation.turnRight(centimetres);
        }
    public void forward(){
            moveToLocation.moveForward(forwardDistance);
            System.out.println("moveForward " + forwardDistance);//test
        }
    
    public void backwards(int centimetres){
            moveToLocation.moveBackwards(centimetres);
        }
    public void wait(int seconds){
        
    }
    public void setCentimetres(double centimetres) {
        this.centimetres = centimetres;
    }

    public double getCentimetres() {
        return centimetres;
    }

    public int getDegreesToTurn() {
        return degreesToTurn;
    }

    public void setDegreesToTurn(int degreesToTurn) {
        this.degreesToTurn = degreesToTurn;
    }

    public Movement getMoveToLocation() {
        return moveToLocation;
    }

    public void setMoveToLocation(Movement moveToLocation) {
        this.moveToLocation = moveToLocation;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public Robot getMyRobot() {
        return myRobot;
    }

    public void setMyRobot() {
        myRobot = new Robot();
        moveToLocation = new Movement(myRobot);
    }

    public ArrayList getTimeQeue() {
        return timeQeue;
    }

    public void setTimeQeue(ArrayList timeQeue) {
        this.timeQeue = timeQeue;
    }

    public ArrayList<String> getCommandList() {
        return commandList;
    }

    public void addCommandToList(String commands) {
        commandList.add(commands);
        
    }

    public ArrayList<String> getInstructionList() {
        return instructionList;
    }

    public int getForwardDistance() {
        return forwardDistance;
    }

    public void setForwardDistance(int forwardDistance) {
        this.forwardDistance = forwardDistance;
    }
    
    public int getBackwardsDistance() {
        return backwardsDistance;
    }

    public void setBackwardsDistance(int backwardsDistance) {
        this.backwardsDistance = backwardsDistance;
    }

    
    
   
    
    
    
    

}
