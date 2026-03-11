import java.util.*;

class CharacterPattern {
    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
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

public class uc7 {

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patterns = new HashMap<>();

        patterns.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patterns.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patterns.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String word = "OOPS";
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(patterns.get(c).getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }
}