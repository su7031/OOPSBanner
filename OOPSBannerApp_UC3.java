/**
 * OOPSBannerApp_UC3 - Use Case 3: String.join Banner
 * This application extends UC2 by utilizing String.join() 
 * rather than simple string concatenation to enhance memory efficiency.
 *
 * @author Antigravity
 * @version 1.0
 */
public class OOPSBannerApp_UC3 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String banner = String.join(System.lineSeparator(),
                "  ***    ***   ****    ***  ",
                " *   *  *   *  *   *  *   * ",
                " *   *  *   *  *   *  *     ",
                " *   *  *   *  ****    ***  ",
                " *   *  *   *  *          * ",
                " *   *  *   *  *      *   * ",
                "  ***    ***   *       ***  "
        );
        System.out.println(banner);
    }
}
