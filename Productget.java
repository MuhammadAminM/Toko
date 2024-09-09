package Toko;

public class Productget {
    public static void main(String[] args) {

        CD cd = new CD();
        cd.setArtist("Lady Gaga");
        cd.setNumSong(10);
        cd.setLabel("Sony Music");
        DVD dvd = new DVD();
        dvd.setLength(300);
        dvd.setRating("PG");
        dvd.setStudio("NewLine Cinema");
        cd.print();
        dvd.print();
    }
}
