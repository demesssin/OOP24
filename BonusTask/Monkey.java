package BonusTask;

class Monkey extends Animal implements CanWalk, CanClimb {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is screeching!");
    }

    @Override
    public void move() {
        System.out.println("Monkey is moving by walking and climbing.");
    }

    @Override
    public void walk(int distance) {
        reduceEnergy(distance * 2, "walked " + distance + " meters");
    }

    @Override
    public void climb(int height) {
        reduceEnergy(height * 4, "climbed " + height + " meters");
    }
}