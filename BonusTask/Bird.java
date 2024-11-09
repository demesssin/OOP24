package BonusTask;

class Bird extends Animal implements CanFly, CanWalk {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping!");
    }

    @Override
    public void move() {
        System.out.println("Bird is moving by flying.");
    }

    @Override
    public void fly(int distance) {
        reduceEnergy(distance * 5, "flew " + distance + " meters");
    }

    @Override
    public void walk(int distance) {
        reduceEnergy(distance * 2, "walked " + distance + " meters");
    }
}