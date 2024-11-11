

import java.util.Scanner;

public class TesterArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mau Masukkan Berapa Data : ");
        int data = input.nextInt();
        System.out.println();

        System.out.println("Pilih Product : ");
        System.out.println("1. CD \n 2. DVD");
        int pilihan = input.nextInt();

        Product[] product = new Product[10];

        for (int i = 1; i <= data; i++) {
            switch (pilihan) {
                case 1:
                System.out.println("Masukkan Name : ");
                String name = input.next();
                System.out.println("Number : ");
                int number = input.nextInt();
                System.out.println("Quantity : ");
                int quantity = input.nextInt();
                System.out.println("Price : ");
                double price = input.nextDouble();
                System.out.println("Artist : ");
                String artist = input.next();
                System.out.println("Label : ");
                String label = input.next();
                System.out.println("NumSong : ");
                int numSong = input.nextInt();
                input.nextLine();
                product[0] = new CD(number, name, quantity, price, artist, numSong, label);
                product[0].print();
                    
                    break;
                case 2:
                System.out.println("Masukkan Name : ");
                name = input.next();
                System.out.println("Number : ");
                number = input.nextInt();
                System.out.println("Quantity : ");
                quantity = input.nextInt();
                System.out.println("Price : ");
                price = input.nextDouble();
                System.out.println("Rating : ");
                String rating = input.next();
                System.out.println("Studio : ");
                String studio = input.next();
                System.out.println("Length : ");
                int length = input.nextInt();
                input.nextLine();
                product[0] = new DVD(number, name, quantity, price, length, rating, studio);
                product[0].print();
                    
                    break;
                default:
                    break;
            }
            
        }

         
        }
    
}
