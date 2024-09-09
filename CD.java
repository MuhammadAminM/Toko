package Toko;
// Pewarisan
public class CD extends Product {
    private String artist;
    private int numSong;
    private String label;

    public CD(){
        super(); // Constractor dari superclass
        artist = "Unknown";
        numSong = 0;
        label = "Unknown";
    }

	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumSong() {
		return this.numSong;
	}

	public void setNumSong(int numSong) {
		this.numSong = numSong;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

    

    
    
    //Override
    public void print(){
        super.print();
        System.out.println("Artist : " + artist);
        System.out.println("Total Song : " + numSong);
        System.out.println("Label : " + label);
    }



}
