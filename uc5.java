public class uc5 {
    public static void main(String[] args) {

        for (String line : new String[] {
                String.join("   ", " ***** ", " ***** ", " ******", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "****** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        }) {
            System.out.println(line);
        }
    }
}