public class Cat extends Animal {

    private String name;
    final static int distanceRunRestrictions = 200;
    final static int distanceSwimRestrictions = 0;
    private static int catsCount = 0;
    private boolean satiety;

    Cat() {
        super();
        this.satiety = false;
        catsCount++;
    }

    public static Cat createCat(String name) {
        Cat tempCat = new Cat();
        tempCat.name = name;
        return tempCat;
    }

    public void run(float distance) {
        if (distance > 0 && distance <= distanceRunRestrictions) {
            super.run(distance);
        } else {
            System.out.println("Такое расстояние неподвластно котам");
        }
    }

    public void swim(float distance) {
        System.out.println("Кот не умеет плавать");
    }

    public void eat(int foodAmount, Bowl bowl) {
        if (bowl.isEnoughFood(foodAmount)) {
            bowl.setFoodAmount(bowl.getFoodAmount() - foodAmount);
            this.satiety = true;
            System.out.printf("\nКот %s наелся\n", this.name);
        } else {
            System.out.printf("\nНе хватило еды в миске коту %s\n", this.name);
        }
    }

    public void printCount() {
        System.out.printf("\nВсего создано %d котов\n", catsCount);
    }

    public void printCountSuper() {
        super.printCount();
    }

}
