/**
 * OOPSBannerApp_UC4 - Use Case 4: Array & Loops
 * This application extends previous use cases by utilizing a String array
 * to structure the ascii art, and an enhanced for-loop to print it.
 *
 * @author Antigravity
 * @version 1.0
 */
public class OOPSBannerApp_UC4 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String[] bannerLines = {
            "  ***    ***   ****    ***  ",
            " *   *  *   *  *   *  *   * ",
            " *   *  *   *  *   *  *     ",
            " *   *  *   *  ****    ***  ",
            " *   *  *   *  *          * ",
            " *   *  *   *  *      *   * ",
            "  ***    ***   *       ***  "
        };
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
