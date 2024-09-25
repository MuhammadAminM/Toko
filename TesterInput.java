import java.util.Scanner;
public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CD/DVD : ");
        String pilihan = in.nextLine();

        System.out.println("Name : ");
        String name = in.nextLine();
        System.out.println("Number : ");
        int number = in.nextInt();
        System.out.println("Quantity : ");
        int quantity = in.nextInt();
        System.out.println("Price : ");
        double price = in.nextDouble();
        in.nextLine();

        if (pilihan.equals("CD")) {
            System.out.println("Artist : ");
            String artist = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("NumSong : ");
            int numSong = in.nextInt();
            CD cd = new CD(number, name, quantity, price, artist, numSong, label);
            cd.print();
        } else if (pilihan.equals("DVD")) {
            System.out.println("Rating : ");
            String rating = in.nextLine();
            System.out.println("Studio : ");
            String studio = in.nextLine();
            System.out.println("Length : ");
            int length = in.nextInt();
            DVD dvd = new DVD(number, name, quantity, price, length, rating, studio);
            dvd.print();
        }
        in.close();
    }
}
