public abstract class Animal {

    private static int animalsCount = 0;

    Animal() {
        animalsCount++;
    }

    public abstract void run(float distance);

    public abstract void swim(float distance);

    public void printCount() {
        System.out.printf("\nВсего создано %d животных\n", animalsCount);
    }
}
