package testpainting;

/**
 * @author Moises Henriquez
 * @date January 29, 2016
 */
public class Painting {
    
    //Instance variables
    
    private String title;
    private String artist;
    private String medium;
    private double est_price;
    private double commission;
    
    //Class constant
    
    private final double GALLERY_COMMISSION = 0.20;
    
    //Default Constructor
    
    public Painting() {
        title = "Title not assigned";
        artist = "Artist name not assigned";
        medium = "Medium not assigned";
        est_price = 0;
    }
    
    //Class methods
    
    //Title get/set method
    public String getTitle(){
        return title;
    }
    public void setTitle(String newValue){
        title = newValue;
    }
    //Artist get/set method
    public String getArtist(){
        return artist;
    }
    public void setArtist(String newValue){
        artist = newValue;
    }
    //Medium get/set method
    public String getMedium(){
        return medium;
    }
    public void setMedium(String newValue){
        medium = newValue;
    }
    //Estimated Price get/set method
    public double getEstPrice(){
        return est_price;
    }
    public void setEstPrice(double newValue){
        est_price = newValue;
    }
    //Gallery Commission get method
    public double getCommission(){
        commission = est_price * GALLERY_COMMISSION;
        return commission;
    }
    //toString method
    public String toString(){
        return title + "\n" +
                artist + "\n" +
                medium + "\n" +
                est_price + "\n" +
                commission + "\n";
    }
}
