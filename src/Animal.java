public abstract class Animal {

    private static int animalsCount = 0;

    Animal() {
        animalsCount++;
    }

    public void run(float distance) {
        System.out.printf("\nЖивотное пробежало %f метров\n", distance);
    }

    public void swim(float distance) {
        System.out.printf("\nЖивотное проплыло %f метров\n", distance);
    }

    public void printCount() {
        System.out.printf("\nВсего создано %d животных\n", animalsCount);
    }
}
