public class Main {

    public static void main(String[] args) {
        Cat[] catArray = new Cat[6];
        catArray[0] = Cat.createCat("Марсик");
        catArray[1] = Cat.createCat("Барсик");
        catArray[2] = Cat.createCat("Варсик");
        catArray[3] = Cat.createCat("Гарсик");
        catArray[4] = Cat.createCat("Зарсик");
        catArray[5] = Cat.createCat("Диоклетиан");
        Dog[] dogArray = new Dog[2];
        dogArray[0] = Dog.createDog("Берта");
        dogArray[1] = Dog.createDog("Альма");

        catArray[0].printCount();
        dogArray[0].printCount();
        catArray[0].printCountSuper();

        Bowl bowl = Bowl.getBowlInstance(0);
        bowl.addFoodAmount(100);
        bowl.massEating(catArray);

        Rectangle rectangle = new Rectangle(10.2, 6);
        rectangle.print();
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.print();
        Circle circle = new Circle(8.45);
        circle.print();
    }

}
