package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RoomTest {

    @Test
    void testGetRoomNumber() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate");

        //when
        int expectedRoomNumber = room.getRoomNumber();

        //then
        assertEquals(1, expectedRoomNumber);
    }

    @Test
    void testGetRoomName() {
        //given
        Room room = new Room(2,"Test Room", "This is a test room", "Test description of investigate");

        //when
        String expectedRoomName = room.getName();

        //then
        assertEquals("Test Room", expectedRoomName);
    }

    @Test
    void testGetRoomDescription() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate");
        //when
        String expectedEnteringRoomDescription = room.getDescriptionWhenEnteringRoom();

        //then
        assertEquals("This is a test room", expectedEnteringRoomDescription);
    }

    @Test
    void testGetDescriptionOnInvestigateRoom() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate");

        //when
        String expectedDescriptionOfInvestigate = room.getDescriptionOnInvestigateRoom();

        //then
        assertEquals("Test description of investigate", expectedDescriptionOfInvestigate);
    }


    @Test
    void testGetListOfItems() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate");

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
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate");

        NPC npc1 = mock(NPC.class);

        //when
        when(npc1.getName()).thenReturn("Guard");


        room.npcInRoom = npc1;



        // then
        assertEquals("Guard", room.getNpcInRoom().getName());

    }

    @Test
    void testGetNpcInRoom() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room", "Test description of investigate");

        NPC npc2 = mock(NPC.class);

        //when
        when(npc2.getName()).thenReturn("Driver");
        when(npc2.getDescription()).thenReturn("Short guy, long hands and sunglasses");

        room.npcInRoom = npc2;



        // then
        assertEquals("Driver", room.getNpcInRoom().getName());
        assertEquals("Short guy, long hands and sunglasses", room.getNpcInRoom().getDescription());
    }




}