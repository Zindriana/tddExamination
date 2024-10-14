package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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






}