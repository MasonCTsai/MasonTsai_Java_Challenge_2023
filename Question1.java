
public class Question1{
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("Roll " + Integer.toString(i + 1) + " = "  + Integer.toString(roll()));
        }
    }

    public static int roll() {
        return (int) Math.floor(Math.random() * 6.0) + 1;
    }
}
