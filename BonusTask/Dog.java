package BonusTask;

class Dog extends Animal implements CanWalk, CanSwim {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking!");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving by walking.");
    }

    @Override
    public void walk(int distance) {
        reduceEnergy(distance * 2, "walked " + distance + " meters");
    }

    @Override
    public void swim(int distance) {
        reduceEnergy(distance * 3, "swam " + distance + " meters");
    }
}