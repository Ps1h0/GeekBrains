public class Cat extends Animal{

    static int numOfCats = 0;
    {
        numOfCats++;
    }

    public Cat(String name) {
        super(name, 200, 0);
    }

    @Override
    public void swim(int swimDist){
        System.out.println(getName() + " не умеет плавать!");
    }
}
