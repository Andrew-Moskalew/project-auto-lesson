public class Speed {
    int velocity;
    int maxVelocity;

    @Override
    public String toString() {
        return "Speed{" +
                "velocity=" + velocity +
                ", maxVelocity=" + maxVelocity +
                '}';
    }

    public Speed(int velocity, int maxVelocity) {
        this.velocity = velocity;
        this.maxVelocity = maxVelocity;
    }

    public void accelerate() {
        this.velocity += 5;
    }

    public void slowDown() {
        this.velocity -= 3;
    }
}