
public class Question2 {
    
    public static void main(String[] args) {
        int rolls[] = {0, 0, 0, 0, 0, 0};
        Die die = new Die();
        for (int i = 0; i < 1000; i++) {
            rolls[die.roll() - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(Integer.toString(i + 1) + " was rolled "  + Integer.toString(rolls[i]) + " times.");
        }
        Die specialDie = new Die(1000);
        if (specialDie.roll() == 1) {
            System.out.println("You are special :D");
        } else {
            System.out.println("You are not special D:");
        }
    }

    static class Die {

        int sides = 0;
        int lastRoll = -1;

        public Die() {
            this.sides = 6;
        }

        public Die(int _sides) {
            this.sides = _sides;
        }

        public int numSides() {
            return this.sides;
        }

        public int roll() {
            lastRoll = (int) Math.floor(Math.random() * sides) + 1;
            return lastRoll;
        }

        public int readLastRoll() {
            return lastRoll;
        }

    }

}
