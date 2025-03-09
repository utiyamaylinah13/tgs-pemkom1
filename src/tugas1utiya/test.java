/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1utiya;

import java.util.Random;

public class test {
    private static final int MIN = 5;
    private static final int MAX = 10;
    
    public static void main(String[] args) {
        Random random = new Random();

        // Dengan +1 (benar)
        System.out.println("Dengan +1:");
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(MAX - MIN + 1) + MIN + " ");
        }

        System.out.println("\nTanpa +1 (salah):");
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(MAX - MIN) + MIN + " ");
        }
    }
}
