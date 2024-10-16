package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RoomTest {

    NPC npc = new NPC();

    @Test
    void testGetRoomNumber() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate", npc);

        //when
        int expectedRoomNumber = room.getRoomNumber();

        //then
        assertEquals(1, expectedRoomNumber);
    }

    @Test
    void testGetRoomName() {
        //given
        Room room = new Room(2,"Test Room", "This is a test room", "Test description of investigate", npc);

        //when
        String expectedRoomName = room.getName();

        //then
        assertEquals("Test Room", expectedRoomName);
    }

    @Test
    void testGetRoomDescription() {
        //given
        Room room = new Room(1, "Middle room", "Middle room", "Middle room", npc);
        //when
        String expectedEnteringRoomDescription = room.getDescriptionWhenEnteringRoom();

        //then
        assertEquals("You enter a dark cavern", expectedEnteringRoomDescription);
    }

    @Test
    void testGetDescriptionOnInvestigateRoom() {
        //given
        Room room = new Room(1, "Middle room", "Middle room", "Middle room", npc);

        //when
        String expectedDescriptionOfInvestigate = room.getDescriptionOnInvestigateRoom();

        //then
        assertEquals(" You hear droplets drop on the cavern ground and the stones feel cold against your bare feet", expectedDescriptionOfInvestigate);
    }


    @Test
    void testGetListOfItems() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate", npc);

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
        assertEquals(3, room.getListOfItems().size());

    }

    @Test
    void testInvestigateNPCInRoom() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate", npc);

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
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate", npc);

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
        Room room = new Room(0, "Starting room",
                "Starting room", "Starting room", npc);

        //when &
        assertEquals("You return to the starting room", room.getDescriptionWhenEnteringRoom());
        assertEquals(" The room is barely lit by a few candles and you feel a light breeze. " +
                "You see something bright and small on the dark stone floor. It is A bright white six-sided die. " +
                "You also see a hooded figure standing next to a large wooden door. It seems like the door is the only way out of here. ",
                room.getDescriptionOnInvestigateRoom());

    }


}