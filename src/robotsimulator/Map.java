package robotsimulator;

/**
 *  The Map class contains everything to do with the location 
 * references which have the ability to describe the location to the user.
 * @author masona11
 */
class Map {
    private int xCoordinates;
    private int yCoordinates;
    String cardinalDirection;
    private int rotationalDegree;
    
    
    public Map(){
        xCoordinates = 0;
        yCoordinates = 0;
        cardinalDirection = "North";
        rotationalDegree = 0;
        //System.out.println("xCoordinates = "+xCoordinates+"\nyCoordinates = "+xCoordinates);//testing
    }

    public String getCardinalDirection() {
        return cardinalDirection;
    }

    public int getRotationalDegree() {
        return rotationalDegree;
    }

    public int getxCoordinates() {
        return xCoordinates;
    }

    public int getyCoordinates() {
        return yCoordinates;
    }
    //Uses the rotational degree to determine the cardinal direction.
    public String setCardinalDirection(int rotationalDegree){
        
        // Numbers in each part of the if statement need to be changed to more accuratley describe the cardinal direction.
        if(rotationalDegree <= 45){
            cardinalDirection = "North";
        }
        else if(rotationalDegree > 45 && rotationalDegree <= 90){
            cardinalDirection = "North-East";
        }
        else if(rotationalDegree > 90 && rotationalDegree <=  135) {
            cardinalDirection = "East";
        }
        else if(rotationalDegree > 135 && rotationalDegree <= 180) {
            cardinalDirection = "South-East";
        }
        else if (rotationalDegree > 180 && rotationalDegree <= 225) {
            cardinalDirection = "South";
        }
        else if (rotationalDegree > 225 && rotationalDegree <= 270) {
            cardinalDirection = "South-West";
        }
        else if (rotationalDegree > 270 && rotationalDegree <= 315) {
            cardinalDirection = "West";
        }
        else if (rotationalDegree > 315 && rotationalDegree <= 360) {
            cardinalDirection = "North-West";
        }
        else{ }
        
        return cardinalDirection;
    }

    public void setRotationalDegree(int rotationalDegree) {
        this.rotationalDegree = rotationalDegree;
    }

    public void setxCoordinates(int xCoordinates) {
        this.xCoordinates = xCoordinates;
        System.out.println("xCoordinates = "+xCoordinates+"\nyCoordinates = "+xCoordinates);//testing
    }

    public void setyCoordinates(int yCoordinates) {
        this.yCoordinates = yCoordinates;
        System.out.println("xCoordinates = "+xCoordinates+"\nyCoordinates = "+yCoordinates);//testing
    }
    
    


}
