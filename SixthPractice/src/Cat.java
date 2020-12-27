public class Cat extends Animal{

    private final int MAX_RUN_DISTANCE = 200;

    static int numOfCats = 0;
    {
        numOfCats++;
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int runDist) {
        if (runDist < MAX_RUN_DISTANCE)
            System.out.println(getName() + " пробежал " + runDist + " метров");
        else
            System.out.println(getName() + " не сможет пробежать " + runDist + " метров");
    }

    @Override
    public void swim(int swimDist) {
        System.out.println("Кошки не умеют плавать!");
    }
}
