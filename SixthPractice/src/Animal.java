public abstract class Animal {

    private final String name;

    //Инициализатор для подсчета количества созданных объектов
    static int numOfAnimals = 0;
    {
        numOfAnimals++;
    }

    public Animal(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public abstract void run(int runDist);
    public abstract void swim(int swimDist);

}
