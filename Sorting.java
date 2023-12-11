/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bublesort;
import java.util.Scanner;
public class BubleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int[] uix = {100000, 87000, 76000, 67000, 22000, 10000, 90000};
        System.out.println("Harga sebelum diurutkan:");
        printArray(uix);
        bubbleSort(uix);
        System.out.println("\nHarga setelah diurutkan :");
        printArray(uix);    
    }
     static void bubbleSort(int[] arr) {
         int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
               }
            }
        }
    }
     static void printArray(int[] arr) {
         int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
     }
        
}
