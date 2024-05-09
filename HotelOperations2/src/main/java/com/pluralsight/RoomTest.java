package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {
    @Test
    public void testCheckInWhenAvailable() {
        // Arrange
        Room room = new Room(2,100.00); // Create a room with 2 beds and a price of $100


        // Act
        boolean result = room.checkIn();

        // Assert
        assertTrue(result); // Check that checkIn() returns true when room is available
        assertTrue(room.isOccupied()); // Check that room is marked as occupied
        assertTrue(room.isDirty()); // Check that room is marked as dirty
    }
    @Test
    public void testCheckOutWhenOccupied() {
        // Arrange
        Room room = new Room(2,139.00);

        // Act
        boolean result = room.checkOut();

        // Assert
        assertTrue(result);
        assertFalse(room.isOccupied());
    }
    @Test
    public void testCleanRoomWhenDirty() {
        // Arrange
        Room room = new Room(2, 124.00);

        // Act
        boolean result = room.cleanRoom();

        // Assert
        assertTrue(result);
        assertFalse(room.isDirty());
    }


}