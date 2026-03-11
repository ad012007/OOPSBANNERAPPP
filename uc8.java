import java.util.HashMap;
import java.util.Map;

public class uc8 {

    public static void main(String[] args) {

        // Map to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        // O pattern
        patternMap.put('O', new String[]{
                " * ",
                "*   *",
                "*   *",
                "*   *",
                " * "
        });

        // P pattern
        patternMap.put('P', new String[]{
                "** ",
                "*   *",
                "** ",
                "*    ",
                "*    "
        });

        // S pattern
        patternMap.put('S', new String[]{
                " **",
                "*    ",
                " * ",
                "    *",
                "** "
        });

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}