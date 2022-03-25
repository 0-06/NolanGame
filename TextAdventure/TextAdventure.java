
/**
 * Nolan's Text adventure game
 *
 * Nolan Peterson
 * @25/03/2022
 */
import java.util.Scanner;
public class TextAdventure
{
    // instance variables 
    String cmd; // Commands
    boolean frontRoom = true;
    boolean livingRoom = false;
    boolean kitchen = false;
    boolean laundry = false;
    boolean bathroom = false;
    boolean playBoxRoom = false;
    boolean smellyRoom = false;
    boolean finished = false;
    boolean laundryKey = false;
    boolean flashlight = false;
    boolean deodorant = false;
    boolean houseKey = false;
    String frontRoomDesc = "You look around. Behind you, to the west you see a door. In front of you, to the east you see a living room. There is a New Zealand flag pinned on the wall. A still wet raincoat and fedora on the hook indicate that someone was here recently…";
    String livingRoomDesc = "You look around. You see a window with bars over it, Next to a coffee table with some carpet underneath it. To your right (south), you see what seems to be a kitchen. There are two rooms in front of you. To the southeast (use east) seems to be a bathroom, and to the northeast (use north) is a closed door.";
    String kitchenDesc = "You see what looks to be a typical kitchen, other than the stacks of mountain dew in the corner. You notice a key left on the kitchen counter.";
    String laundryDesc = "You look around. The room is quite small, barely fitting the washing machine and dryer, and is full of dirty clothing. Next to the door, you notice a flashlight. You also see a bottle of deodorant poking out from under a pile of clothes. It has not been opened.";
    String bathroomDesc = "You enter a small room consisting of a sink, and a toilet. You realise that you really, really need to use the toilet.";
    String playBoxRoomDesc = "You enter what seems to be a room consisting of a couch, a tv, and a brand new Microhard PlayBox. You see the new game BalorBant by Peaceful Protest games on the screen, and you really want to play. You hear snores vibrating through the walls from the next room.";
    String smellyRoomDesc = "You walk into what seems to be a bedroom. There seems to be an aroma that resembles sweat and feces radiating from the bed. You see a foot sticking out of the blanket, but you can’t get close enough to wake them up without passing out or vomiting. ";
   String walkWall = "You walk into a wall. Ouch";
   
    String roomdescription[] = new String[] {frontRoomDesc, livingRoomDesc, kitchenDesc, laundryDesc, bathroomDesc, playBoxRoomDesc, smellyRoomDesc};
   
    boolean location[] = new boolean[] {frontRoom, livingRoom, kitchen, laundry, bathroom, playBoxRoom, smellyRoom};
   
    boolean items [] = new boolean[] {laundryKey, flashlight, deodorant, houseKey};
    
    /**
     * Constructor for objects of class TextAdventure
     */
    public TextAdventure()
    {
        // initialise instance variables
        Scanner keyboardReader = new Scanner(System.in); // Keyboard Scan
        System.out.println("What would you like to do?");
        
        
        while (finished==false){
            cmd=keyboardReader.nextLine();
        switch (cmd) {
            
            case "look" : 
            
            if(location[0]==true){
                System.out.println(roomdescription[0]);
               
            }
            
            else if(location[1]==true){
                System.out.println(roomdescription[1]);
            }
            else if(location[2]==true){
                System.out.println(roomdescription[2]);
            }
            else if(location[3]==true){
                System.out.println(roomdescription[3]);          
            }
            else if(location[4]==true){
                System.out.println(roomdescription[4]);
            }
            else if(location[5]==true){
                System.out.println(roomdescription[5]);
            }
           else if(location[6]==true){
             System.out.println(roomdescription[6]);
            }
            break;
            case "north" :
            if(location[0]==true){
                System.out.println(walkWall);
            }
            else if (location[1]==true && items[1]==true){
                System.out.println();
            }
            
            break;
            case "south" :
            break;
            case "east" : 
            break; 
            case "west" :
            break;
           
            
            default: System.out.println("I don't recognise that command");
            break;
        
        }
    }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
        // put your code here
        
    
}
