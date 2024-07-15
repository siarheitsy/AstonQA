public class Dog extends Animal {

    final static int distanceRunRestrictions = 500;
    final static int distanceSwimRestrictions = 10;
    private static int dogsCount = 0;

    Dog(String name) {
        super(name);
        dogsCount++;
    }

    public void run(float distance) {
        if (distance > 0 && distance <= distanceRunRestrictions) {
            super.run(distance);
        } else {
            System.out.println("Такое расстояние неподвластно собакам");
        }
    }

    public void swim(float distance) {
        if (distance > 0 && distance <= distanceSwimRestrictions) {
            super.swim(distance);
        } else {
            System.out.println("Такое расстояние неподвластно собакам");
        }
    }

    public void printCount() {
        System.out.printf("\nВсего создано %d собак\n", dogsCount);
    }

    public void printCountSuper() {
        super.printCount();
    }
}