
/**
 * Nolan's Text adventure game
 *
 * Nolan Peterson
 * @13/04/2022
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
    boolean secretRoom=false;
    String frontRoomDesc = "You look around. Behind you, to the west you see a door. In front of you, to the east you see a living room. There is a New Zealand flag pinned on the wall. A still wet raincoat and fedora on the hook indicate that someone was here recently…";
    String livingRoomDesc = "You look around. You see a window with bars over it, Next to a coffee table with some carpet underneath it. To your right (south), you see what seems to be a kitchen. There are two rooms in front of you. To the southeast (use east) seems to be a bathroom, and to the northeast (use north) is a closed door.";
    String kitchenDesc = "You see what looks to be a typical kitchen, other than the stacks of mountain dew in the corner. You notice a key left on the kitchen counter.";
    String laundryDesc = "You look around. The room is quite small, barely fitting the washing machine and dryer, and is full of dirty clothing. Next to the door, you notice a flashlight. You also see a bottle of deodorant poking out from under a pile of clothes. It has not been opened.";
    String bathroomDesc = "You enter a small room consisting of a sink, and a toilet. You realise that you really, really need to use the toilet.";
    String playBoxRoomDesc = "You enter what seems to be a room consisting of a couch, a tv, and a brand new Microhard PlayBox. You see the new game BalorBant by Peaceful Protest games on the screen, and you really want to play. You hear snores vibrating through the walls from the next room.";
    String smellyRoomDesc = "You walk into what seems to be a bedroom. There seems to be an aroma that resembles sweat and feces radiating from the bed. You see a foot sticking out of the blanket, but you can’t get close enough to wake them up without passing out or vomiting. ";
   String secretRoomDesc = "You are in what seems to be a repurposed wine cellar. A sleeping child lies on a bed in the middle of the room. He mutters 'Don't play on the playbox...'";
   
    String roomdescription[] = new String[] {frontRoomDesc, livingRoomDesc, kitchenDesc, laundryDesc, bathroomDesc, playBoxRoomDesc, smellyRoomDesc, secretRoomDesc};
   
    boolean location[] = new boolean[] {frontRoom, livingRoom, kitchen, laundry, bathroom, playBoxRoom, smellyRoom, secretRoom};
   
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
            cmd=keyboardReader.nextLine(); // Always looking for new text
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
            else if (location[7]==true){
                System.out.println(roomdescription[7]);
            }
            break;
            case "north" :
            
            
            if (location[1]==true && items[1]==true){
                System.out.println();
                location[3]=true;
                location[1]=false;
                System.out.println("You walk into the Laundry room");
            }
            else if(location[1]==true && items[0]==false){
                System.out.println("It's locked.");
            }
            else if (location[2]==true){
                System.out.println("You walk into the living room");
                location[2]=false;
                location[1]=true;
            }
            else if (location[5]==true){
                System.out.println("You walk into the bathroom");
                location[5]=false;
                location[4]=true;
            }
            else {
                System.out.println("You walk into a wall. Ouch");
            }
            
            break;
            case "south" :
            if (location [1]==true){
                location [2] = true;
                location [1] = false;
                System.out.println("You walk into the Kitchen");
            }
            else if (location [4]==true && items[1]==true){
                System.out.println("You walk down the secret passage. You sure are thankful that the torch has charge");
                location [4]=false;
                location [5] = true;
            }
            else if (location [4]==true && items[1]==false){
                System.out.println("You are too scared to go down the dark alley. Try find a torch");
            }
            else {
                System.out.println("You can't go that way");
            }
            break;
            case "east" : 
            if (location [0]==true){
                location [1]=true;
                location [0]=false;
                System.out.println("You walk into the Living room");
                
            }
            else if (location [6]==true){
                System.out.println("You walk back into the playbox room");
                location [6]=false;
                location [5]=true;
            }
            else if (location [1] ==true){
                System.out.println("You walk into the bathroom");
                location [4] = true;
                location [1] = false;
            }
            else {
                System.out.println("You consider walking into the wall but decide against it");
            }
            break; 
            case "west" :
            if (location [0] == true && items[3]==true){
                System.out.println("You are finally free, you win!");
                finished=true;
            }
            else if (location [1] == true) {
                location [0] = true;
                location [1] = false;
                System.out.println("You walk into the front room.");
            }
            else if (location [3] || location [4]) {
                location [1] = true;
                location [4] = false;
                location [3] = false;
                System.out.println("You walk into the living room");
            }
            else if (location [5] == true){
                System.out.println("You walk into what seems to be a bedroom");
                location [6] = true;
                location [5] = false;
                
            }
            else if (location [6] == true && items [3] == true){
            System.out.println("You are back in the front room");
            location [0] = true;
            location [6] = false;
        }
        else {
            System.out.println("...");
        }
            break;
           case "down" :
           if (location [1] == true){
               location [7] = true;
               location [1] = false;
               System.out.println("You raise the carpet, and underneath is a ladder. You go down");
              
            }
            else {
                System.out.println("You get on the floor like an idiot");
            }
            
            break;
              case "up" :
           if (location [7] == true){
               location [1] = true;
               location [7] = false;
               System.out.println("You climb up the ladder");
              
            }
            else {
                System.out.println("you try to fly but remember you can't");
            }
            
            break;
            case "take": case "take key": case "take deodorant" : case "take flashlight": case "pick up" :
            if (location [1] == true){
                items [0] = true;
            }
            else if (location [2] == true){
                items [1] = true;
                items [2] = true;
            }
            else if (location [6] = true){
                items [3] = true;
            }
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
