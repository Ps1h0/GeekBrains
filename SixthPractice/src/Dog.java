public class Dog extends Animal{

    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;

    static int numOfDogs = 0;
    {
        numOfDogs++;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int runDist) {
        if(runDist < MAX_RUN_DISTANCE)
            System.out.println(getName() + " пробежал " + runDist + " метров");
        else
            System.out.println(getName() + " не сможет пробежать " + runDist + " метров");
    }

    @Override
    public void swim(int swimDist) {
        if (swimDist < MAX_SWIM_DISTANCE)
            System.out.println(getName() + " проплыл " + swimDist + " метров");
        else
            System.out.println(getName() + " не сможет проплыть " + swimDist + " метров");
    }

}
