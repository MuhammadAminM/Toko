package Toko;

public class DVD {
    private int length;
    private String rating ;
    private String studio;

    public DVD(){
        super();
        length = 0;
        rating = "";
        studio = "";
    }

	public int getLength() {
		return this.length;
	}

	public void setLength(int legnth) {
		this.length = legnth;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getStudio() {
		return this.studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}
    public void print() {
        
        System.out.println("Length : " + length);
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " + studio);
    }
    
}
