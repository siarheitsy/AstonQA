public class Animal {

    protected String name;
    private static int animalsCount = 0;

    Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(float distance) {
        System.out.printf("\n%s пробежал/а %f метров\n", this.name, distance);
    }

    public void swim(float distance) {
        System.out.printf("\n%s проплыл/а %f метров\n", this.name, distance);
    }

    public void printCount() {
        System.out.printf("\nВсего создано %d животных\n", animalsCount);
    }
}
