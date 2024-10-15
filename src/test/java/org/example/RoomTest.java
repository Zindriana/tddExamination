package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class RoomTest {

    @Test
    void testGetRoomNumber() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room");

        //when
        int expectedRoomNumber = room.getRoomNumber();

        //then
        assertEquals(1, expectedRoomNumber);
    }

    @Test
    void testGetRoomName() {
        //given
        Room room = new Room(2,"Test Room", "This is a test room");

        //when
        String expectedRoomName = room.getName();

        //then
        assertEquals("Test Room", expectedRoomName);
    }

    @Test
    void testGetRoomDescription() {
        //given
        Room room = new Room(1, "Test Room", "This is a test room");
        //when
        String expectedRoomDescription = room.getDescription();

        //then
        assertEquals("This is a test room", expectedRoomDescription);
    }


    @Test
    void test() {
        //given mocked room



    }


}