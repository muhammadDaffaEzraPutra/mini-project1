package main;

import model.room;  // Menggunakan huruf besar di awal untuk class Room
import service.RoomService;

import java.util.Scanner;

public class main {  // Kelas harus dimulai dengan huruf besar sesuai konvensi
    public static void main(String[] args) {
        RoomService roomService = new RoomService();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n=== Sistem Manajemen Ruangan Kampus ===");
            System.out.println("1. Tambah Ruangan");
            System.out.println("2. Lihat Semua Ruangan");
            System.out.println("3. Update Ruangan");
            System.out.println("4. Hapus Ruangan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID Ruangan: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Masukkan Nama Ruangan: ");
                    String name = scanner.nextLine();

                    System.out.print("Masukkan Kapasitas Ruangan: ");
                    int capacity = scanner.nextInt();

                    roomService.addRoom(new room(id, name, capacity));  // Memanggil metode dari objek roomService
                    break;

                case 2:
                    roomService.displayRooms();  // Memanggil metode dari objek roomService
                    break;

                case 3:
                    System.out.print("Masukkan ID Ruangan yang ingin di-update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Masukkan Nama Ruangan Baru: ");
                    String newName = scanner.nextLine();

                    System.out.print("Masukkan Kapasitas Baru: ");
                    int newCapacity = scanner.nextInt();

                    roomService.updateRoom(updateId, newName, newCapacity);  // Memanggil metode dari objek roomService
                    break;

                case 4:
                    System.out.print("Masukkan ID Ruangan yang ingin dihapus: ");
                    int deleteId = scanner.nextInt();
                    roomService.deleteRoom(deleteId);  // Memanggil metode dari objek roomService
                    break;

                case 5:
                    running = false;
                    System.out.println("Keluar dari sistem...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
        scanner.close();
    }
}
