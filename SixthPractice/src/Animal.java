public abstract class Animal {

    private final String name;
    private final int maxRunDist;
    private final int maxSwimDist;

    //Инициализатор для подсчета количества созданных объектов
    static int numOfAnimals = 0;
    {
        numOfAnimals++;
    }

    public Animal(String name, int maxRunDist, int maxSwimDist) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
    }

    public String getName() {
        return name;
    }

    public void run(int runDist) {
        if(runDist < maxRunDist)
            System.out.println(getName() + " пробежал " + runDist + " метров");
        else
            System.out.println(getName() + " не сможет пробежать " + runDist + " метров");
    }
    public void swim(int swimDist) {
        if (swimDist < maxSwimDist)
            System.out.println(getName() + " проплыл " + swimDist + " метров");
        else
            System.out.println(getName() + " не сможет проплыть " + swimDist + " метров");
    }

}
