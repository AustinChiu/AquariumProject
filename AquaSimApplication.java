import java.awt.Color;
import java.util.Random;


/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
     private static Random generator;
    public static void main(String args[])
    {
    
        System.out.println("I love tennis");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
             generator= new Random();

            
        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(1000, 1000); // ... object that has now been created

        // Construct fish and add them to the aquarium.
        //      CODE MISSING HERE!
        
       //add aquafish to aquarium
        AquaFish nemo = new AquaFish(aqua,getColor());
        aqua.add(nemo);
        AquaFish sushi = new AquaFish(aqua,getColor());
        aqua.add(sushi);
        AquaFish teemo = new AquaFish(aqua,getColor());
        aqua.add(teemo);
        AquaFish a = new AquaFish(aqua,getColor());
        aqua.add(a);
        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua);  // ... and then GUI itself

        // Tell the user how to start the aquarium simulation.
        System.out.println("Press the Start button to start the simulation.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();


        // RUN THE AQUARIUM SIMULATION.
        // Make the fish move and redisplay.
        //      CODE MISSING HERE!
        nemo.moveForward();
        sushi.moveForward();
        teemo.moveForward();
        a.moveForward();
        int i =10;
        for(int steps=0;steps<userInterface.getNumberOfSteps() ;steps++){
        if(nemo.atWall())
            nemo.changeDir();
        nemo.moveForward();
        if(sushi.atWall())
            sushi.changeDir();
        sushi.moveForward();
        if(teemo.atWall())
            teemo.changeDir();
        teemo.moveForward();
        if(a.atWall())
            a.changeDir();
        a.moveForward();
        
        userInterface.showAquarium();
    }
            
            
        }
    public static Color getColor(){
          int randNum = generator.nextInt(5);
          if(randNum == 0){
                return Color.RED;
            }else if(randNum ==1){
                return Color.BLUE;
                
            }else if(randNum ==2){
                return Color.GREEN;
            }else if (randNum == 3){
                return Color.YELLOW;

            }else if (randNum==4){
                return Color.ORANGE;
            }else{
              return Color.MAGENTA;   
            }
            
        }
            

        // WRAP UP
        // Remind user how to quit application

    }//end main

//end class
