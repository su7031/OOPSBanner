/**
 * OOPSBannerApp_UC5 - Use Case 5: Array Initialization
 * This application extends previous use cases by combining array declaration
 * and initialization directly with String.join() for enhanced readability and conciseness.
 *
 * @author Antigravity
 * @version 1.0
 */
public class OOPSBannerApp_UC5 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String[] bannerLines = {
            String.join("", "  ***    ", "***   ", "****    ", "***  "),
            String.join("", " *   *  *", "   *  ", "*   *  *", "   * "),
            String.join("", " *   *  *", "   *  ", "*   *  *", "     "),
            String.join("", " *   *  *", "   *  ", "****    ", "***  "),
            String.join("", " *   *  *", "   *  ", "*       ", "   * "),
            String.join("", " *   *  *", "   *  ", "*      *", "   * "),
            String.join("", "  ***    ", "***   ", "*       ", "***  ")
        };
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
