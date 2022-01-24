import java.util.Random;

public class Pirate {
    int drunkennessLevel, strength;
    boolean alive;

    Pirate() {
        this.drunkennessLevel = 0;
        this.strength = 4;
        this.alive = true;
    }

    void drinkSomeRum() {
        if (this.alive) {
            this.drunkennessLevel++;
            this.strength--;
        } else {
            System.out.println("He is dead");
        }
    }

    void howsItGoingMate() {
        if (this.alive) {
            if (this.drunkennessLevel < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                this.passOut();
            }
        } else {
            System.out.println("He is dead");
        }
    }

    void brawl(Pirate pirate) {
        if (this.alive && pirate.alive) {
            if (this.strength > pirate.strength) {
                this.strength -= pirate.strength;
                pirate.die();
            } else if (pirate.strength > this.strength) {
                pirate.strength -= this.strength;
                this.die();
            } else {
                Random random = new Random();
                int whoDies = random.nextInt(3);
                if (whoDies == 0) {
                    this.passOut();
                    pirate.passOut();
                } else if (whoDies == 1) {
                    this.die();
                } else {
                    pirate.die();
                }
            }
        } else if (!this.alive && pirate.alive) {
            System.out.println("This pirate is dead");
        } else if (this.alive) {
            System.out.println("The pirate you want to fight is dead");
        } else {
            System.out.println("They are both dead");
        }
    }

    void die() {
        if (this.alive) {
            this.alive = false;
        } else {
            System.out.println("He's dead already");
        }
    }

    void passOut() {
        if (this.alive) {
            this.drunkennessLevel = 0;
            this.strength = 4;
            System.out.println("Zzzzzz...");
        } else {
            System.out.println("He is dead");
        }
    }
}
