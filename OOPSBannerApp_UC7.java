/**
 * OOPSBannerApp_UC7 - Use Case 7: Store Character Pattern in a Class
 * This application extends previous use cases by utilizing a static inner class
 * to encapsulate the letter identity along with its corresponding string array pattern.
 *
 * @author Antigravity
 * @version 1.0
 */
public class OOPSBannerApp_UC7 {

    /**
     * CharacterPatternMap - Encapsulates ASCII art character data.
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Main method - the entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        
        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[] {
            "  ***    ",
            " *   *  *",
            " *   *  *",
            " *   *  *",
            " *   *  *",
            " *   *  *",
            "  ***    "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[] {
            "****    ",
            "*   *  *",
            "*   *  *",
            "****    ",
            "*       ",
            "*      *",
            "*       "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[] {
            "***  ",
            "   * ",
            "     ",
            "***  ",
            "   * ",
            "   * ",
            "***  "
        });

        CharacterPatternMap[] oopsWord = {oPattern, oPattern, pPattern, sPattern};
        
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (CharacterPatternMap map : oopsWord) {
                lineBuilder.append(map.getPattern()[i]);
            }
            bannerLines[i] = lineBuilder.toString();
        }
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
