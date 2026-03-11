/**
 * OOPSBannerApp_UC6 - Use Case 6: Static Functions
 * This application extends previous use cases by extracting the hard-coded
 * ascii characters into dedicated reusable static helper functions (O, P, S).
 *
 * @author Antigravity
 * @version 1.0
 */
public class OOPSBannerApp_UC6 {

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String[] o = getO();
        String[] p = getP();
        String[] s = getS();
        
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("", o[i], o[i], p[i], s[i]);
        }
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Returns the 7-line pattern for the letter 'O'
     * @return String array representing 'O'
     */
    public static String[] getO() {
        return new String[] {
            "  ***    ",
            " *   *  *",
            " *   *  *",
            " *   *  *",
            " *   *  *",
            " *   *  *",
            "  ***    "
        };
    }

    /**
     * Returns the 7-line pattern for the letter 'P'
     * @return String array representing 'P'
     */
    public static String[] getP() {
        return new String[] {
            "****    ",
            "*   *  *",
            "*   *  *",
            "****    ",
            "*       ",
            "*      *",
            "*       "
        };
    }

    /**
     * Returns the 7-line pattern for the letter 'S'
     * @return String array representing 'S'
     */
    public static String[] getS() {
        return new String[] {
            "***  ",
            "   * ",
            "     ",
            "***  ",
            "   * ",
            "   * ",
            "***  "
        };
    }
}
