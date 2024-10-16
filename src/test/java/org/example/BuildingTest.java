package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {

    @Test
    void getNumberOfRoomsTest() {
        Building building = new Building();

        assertEquals(4, building.getNumberOfRooms());
    }
}