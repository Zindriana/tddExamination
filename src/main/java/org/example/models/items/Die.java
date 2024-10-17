package org.example.models.items;

import org.example.models.Room;

import java.util.Random;

public class Die extends Item {

    private int totalDieValue = 0;
    private final Random rand = new Random();

    public Die() {
        super("Die");
    }

    @Override
    public void use(Room room){
        int dieRoll = rand.nextInt(5) + 2;
        totalDieValue += dieRoll;

        if(room.getRoomNumber() == 0){
            System.out.println("You throw the six sided die on the floor and it face you with " + dieRoll + " dots.\n" +
                    "It´s light starts to glow stronger.\n");
            if(totalDieValue >6){
                room.setDoorIsLocked(false);
            }
        }
        if(room.getRoomNumber() == 1){
            System.out.println("You roll the shining die and it glows even stronger than before,\n " +
                            "lighten up most of the room. As you suspected, it is just another small room in the cavern. \n" +
                            "Water droplets fall from the roof and the droplets that touch your face feel very cold. \n" +
                            "The light from the die is being returned from some reflection on the other side of the room.\n");
            room.setDescriptionOnInvestigateRoom("A small cavern room. Water drops from the roof.\n" +
                    "some patches of ice on the other side of the room reflects the light from your die. " +
                    "A unproportional large door is also there. You reach for the door knob but stop. \n" +
                    "The whole door knob including the lock is totally frozen and covered in a layer of ice. \n" +
                    "You will not be able to open it at the moment. You also detect where the cold wind is coming from. \n" +
                    "There is a somewhat big hole at the top of the wall near the roof on the same side as the door. \n" +
                    "It is to high up to reach." );
        }
    }

    public int getTotalDieValue(){
        return totalDieValue;
    }

}
