public class Main {

    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик");
        barsik.run(15);
        barsik.swim(5);

        Dog baron = new Dog("Барон");
        baron.run(150);
        baron.swim(7);

        Cat murzik = new Cat("Мурзик");
        murzik.run(17);

        Cat vaska = new Cat("Васька");
        vaska.run(100);

        printInfo();
    }

    public static void printInfo(){
        System.out.println("Создано животных: " + Animal.numOfAnimals + "\n" +
                "Кошек: " + Cat.numOfCats + "\n"+
                "Собак: " + Dog.numOfDogs);
    }
}
