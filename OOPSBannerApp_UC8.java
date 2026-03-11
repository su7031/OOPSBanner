import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp_UC8 - Use Case 8: Map for Character Patterns
 * This application is the final iteration, utilizing a built-in HashMap 
 * to store character-to-pattern pairs for efficient O(1) lookups and
 * immense scalability compared to manual structure iterations.
 *
 * @author Antigravity
 * @version 1.0
 */
public class OOPSBannerApp_UC8 {

    /**
     * Map holding the characters and their string array matrix patterns.
     */
    private static final Map<Character, String[]> PATTERN_MAP = new HashMap<>();

    static {
        PATTERN_MAP.put('O', new String[]{
            "  ***    ",
            " *   *  *",
            " *   *  *",
            " *   *  *",
            " *   *  *",
            " *   *  *",
            "  ***    "
        });

        PATTERN_MAP.put('P', new String[]{
            "****    ",
            "*   *  *",
            "*   *  *",
            "****    ",
            "*       ",
            "*      *",
            "*       "
        });

        PATTERN_MAP.put('S', new String[]{
            "***  ",
            "   * ",
            "     ",
            "***  ",
            "   * ",
            "   * ",
            "***  "
        });
    }

    /**
     * Renders a given word to the console based on the PATTERN_MAP.
     * 
     * @param word The word to render as a banner
     */
    public static void renderBanner(String word) {
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
            for (char c : word.toCharArray()) {
                String[] pattern = PATTERN_MAP.get(c);
                if (pattern != null) {
                    lineBuilder.append(pattern[i]);
                } else {
                    // Fallback spacing for unknown characters
                    lineBuilder.append("       ");
                }
            }
            bannerLines[i] = lineBuilder.toString();
        }

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}
