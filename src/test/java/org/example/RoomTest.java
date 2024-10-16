package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RoomTest {

    NPC npc = new NPC("hooded figure");

    @Test
    void testGetRoomNumber() {
        //given
        Room room = new Room(1, "Test Room", npc);

        //when
        int expectedRoomNumber = room.getRoomNumber();

        //then
        assertEquals(1, expectedRoomNumber);
    }

    @Test
    void testGetRoomName() {
        //given
        Room room = new Room(2,"Test Room",  npc);

        //when
        String expectedRoomName = room.getName();

        //then
        assertEquals("Test Room", expectedRoomName);
    }

    @Test
    void testGetRoomDescription() {
        //given
        Room room = new Room(1, "Middle room",  npc);
        //when
        String expectedEnteringRoomDescription = room.getDescriptionWhenEnteringRoom();

        //then
        assertEquals("You enter a dark cavern", expectedEnteringRoomDescription);
    }

    @Test
    void testGetDescriptionOnInvestigateRoom() {
        //given
        Room room = new Room(1, "Middle room",  npc);

        //when
        String expectedDescriptionOfInvestigate = room.getDescriptionOnInvestigateRoom();

        //then
        assertEquals(" You hear droplets drop on the cavern ground and the stones feel cold against your bare feet", expectedDescriptionOfInvestigate);
    }


    @Test
    void testGetListOfItems() {
        //given
        Room room = new Room(1, "Test Room",  npc);

        Item item1 = mock(Item.class);
        Item item2 = mock(Item.class);
        Item item3 = mock(Item.class);


        //when
        when(item1.getName()).thenReturn("Key");
        when(item2.getName()).thenReturn("Locked Door");
        when(item3.getName()).thenReturn("Bucket");

        room.itemsInRoom.add(item1);
        room.itemsInRoom.add(item2);
        room.itemsInRoom.add(item3);



        // then
        assertEquals("Key", room.itemsInRoom.get(0).getName());
        assertEquals("Locked Door", room.itemsInRoom.get(1).getName());
        assertEquals("Bucket", room.itemsInRoom.get(2).getName());
        assertEquals(3, room.itemsInRoom.size());

    }

    @Test
    void testInvestigateNPCInRoom() {
        //given
        Room room = new Room(1, "Test Room",  npc);

        NPC npc1 = mock(NPC.class);
        room.setNpcInRoom(npc1);

        //when
        when(npc1.getName()).thenReturn("Guard");


        // then
        assertEquals("Guard", room.getNpcInRoom().getName());

    }

    @Test
    void testGetNpcInRoom() {
        //given
        Room room = new Room(1, "Test Room", npc);

        NPC npc2 = mock(NPC.class);
        room.setNpcInRoom(npc2);

        //when
        when(npc2.getName()).thenReturn("Driver");
        when(npc2.getDescription()).thenReturn("Short guy, long hands and sunglasses");


        // then
        assertEquals("Driver", room.getNpcInRoom().getName());
        assertEquals("Short guy, long hands and sunglasses", room.getNpcInRoom().getDescription());
    }

    @Test
    void testStartingRoom(){
        //given
        NPC npc = mock(NPC.class);
        Room room = new Room(0, "Starting room", npc);

        //when &
        assertEquals("You return to the starting room", room.getDescriptionWhenEnteringRoom());
        assertEquals(" The room is barely lit by a few candles and you feel a light breeze. " +
                "You see something bright and small on the dark stone floor. It is A bright white six-sided die. " +
                "You also see a hooded figure standing next to a large wooden door. It seems like the door is the only way out of here. ",
                room.getDescriptionOnInvestigateRoom());

    }


    @Test
    void testInvestigatingRoom(){
        //given
        Room room = new Room(0,"Starting room", npc);
        Item item = mock(Item.class);
        Item item2 = mock(Item.class);


        NPC npc = mock(NPC.class);

        //when
        when(item.getName()).thenReturn("Table");
        when(item.getDescription()).thenReturn("Round big table for a viking party");
        when(item2.getName()).thenReturn("Chair");
        when(item2.getDescription()).thenReturn("This chair is design in stone by Rangnaroke");

        when(npc.getName()).thenReturn("Rangnaroke");
        when(npc.getDescription()).thenReturn("A wise and powerful viking warrior");

        room.itemsInRoom.add(item);
        room.itemsInRoom.add(item2);

        room.setNpcInRoom(npc);

        //then
        assertEquals("Starting room", room.getName());
        assertEquals("Rangnaroke", npc.getName());
        assertEquals("A wise and powerful viking warrior", npc.getDescription());
        assertEquals("Round big table for a viking party", item.getDescription());
        assertEquals("Table", item.getName());
        assertEquals("Chair", item2.getName());
        assertEquals("This chair is design in stone by Rangnaroke", item2.getDescription());

    }

    @Test
    void testRoomInvestigation() {
        //given
        Room room = new Room(0,"Starting room", npc);
        Item item = new Item("Candle","A thick white candle. It has been used sometime before.");
        room.itemsInRoom.add(item);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        room.investigateRoom();

        //when

        //then
        assertEquals("The room is barely lit by a few candles and you feel a light breeze." +
                " You see something bright and small on the dark stone floor. It is A bright white six-sided die." +
                " You also see a mysterious hooded figure standing next to a large wooden door. It seems like the door is the only way out of here. " + System.getProperty("line.separator") +"Items in the room: " + System.getProperty("line.separator") +"Candle", outContent.toString().trim());
    }

}