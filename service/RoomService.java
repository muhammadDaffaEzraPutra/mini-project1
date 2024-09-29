/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import model.room;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class RoomService {
    private ArrayList<room> rooms;

    // Constructor
    public RoomService() {
        rooms = new ArrayList<>();
    }

    // Method untuk menambahkan ruangan
    public void addRoom(room room) {
        rooms.add(room);
        System.out.println("Ruangan berhasil ditambahkan!");
    }

    // Method untuk menampilkan semua ruangan
    public void displayRooms() {
        if (rooms.isEmpty()) {
            System.out.println("Tidak ada ruangan yang tersedia.");
        } else {
            System.out.println("\nDaftar Ruangan:");
            for (room room : rooms) {
                room.displayInfo();
            }
        }
    }

    // Method untuk mengupdate informasi ruangan
    public void updateRoom(int id, String newName, int newCapacity) {
        for (room room : rooms) {
            if (room.getId() == id) {
                room.setName(newName);
                room.setCapacity(newCapacity);
                System.out.println("Ruangan berhasil di-update!");
                return;
            }
        }
        System.out.println("Ruangan dengan ID " + id + " tidak ditemukan.");
    }

    // Method untuk menghapus ruangan
    public void deleteRoom(int id) {
        for (room room : rooms) {
            if (room.getId() == id) {
                rooms.remove(room);
                room.roomCount--; // Update jumlah ruangan
                System.out.println("Ruangan berhasil dihapus!");
                return;
            }
        }
        System.out.println("Ruangan dengan ID " + id + " tidak ditemukan.");
    }
    
}

