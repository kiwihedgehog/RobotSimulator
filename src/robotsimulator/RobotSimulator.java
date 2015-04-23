package robotsimulator;

/**
 *
 * @author Andy Mason   
 * @author Mitch Hill
 */
public class RobotSimulator {
  
    
    /**
     * 
     * This is the main class of the program where the entire program will be executed from.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    SimulatorEngineState mySimulation = new SimulatorEngineState();

       mySimulation.setEngineState(1);
       mySimulation.setEngineState(2);
       mySimulation.setEngineState(3);
    }
    
}
