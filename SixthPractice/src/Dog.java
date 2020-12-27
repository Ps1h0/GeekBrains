public class Dog extends Animal{

    static int numOfDogs = 0;
    {
        numOfDogs++;
    }

    public Dog(String name) {
        super(name, 500, 10);
    }
}
