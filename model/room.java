/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */


public class room {
    private int id;
    private String name;
    private int capacity;

    // Static variable untuk menghitung jumlah ruangan
    public static int roomCount = 0;

    // Constructor
    public room(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        roomCount++;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Method untuk menampilkan informasi ruangan
    public void displayInfo() {
        System.out.println("ID: " + id + ", Nama: " + name + ", Kapasitas: " + capacity);
    }
}

