public class Main {

    public static void main(String[] args) {
        Cat[] catArray = new Cat[6];
        catArray[0] = new Cat("Марсик");
        catArray[1] = new Cat("Барсик");
        catArray[2] = new Cat("Варсик");
        catArray[3] = new Cat("Гарсик");
        catArray[4] = new Cat("Зарсик");
        catArray[5] = new Cat("Диоклетиан");
        Dog[] dogArray = new Dog[2];
        dogArray[0] = new Dog("Берта");
        dogArray[1] = new Dog("Альма");

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
