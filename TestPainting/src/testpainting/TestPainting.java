package testpainting;
import java.util.Scanner;
/**
 * @author Moises Henriquez
 * @date January 29, 2016
 */
public class TestPainting {

    public static void main(String[] args) {
        
        //Local variables
        String title, artist, medium;
        double ep;
        
        //Instantiate Scanner object
        Scanner input = new Scanner(System.in);
        
        //Instantiate Painting objects
        Painting painting1 = new Painting();
        Painting painting2 = new Painting();
        
        //List Painting1 data values
        System.out.println(painting1.toString());
        
        //Input Painting2 data values
        System.out.println("Enter the painting title:");
        title = input.nextLine();
        painting2.setTitle(title);
        
        System.out.println("Enter the painting artist:");
        artist = input.nextLine();
        painting2.setArtist(artist);
        
        System.out.println("Enter the estimated price:");
        ep = input.nextDouble();
        painting2.setEstPrice(ep);
        painting2.getCommission(); //Calculate commission
        input.nextLine();
        
        System.out.println("Enter the medium:");
        medium = input.nextLine();
        painting2.setMedium(medium);
        
        //List Painting2 data values
        System.out.println(painting2.toString());
    }
    
}
