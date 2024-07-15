public class Cat extends Animal {

    final static int distanceRunRestrictions = 200;
    final static int distanceSwimRestrictions = 0;
    private static int catsCount = 0;
    private boolean satiety;

    Cat(String name) {
        super(name);
        this.satiety = false;
        catsCount++;
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
            bowl.setFoodAmount(bowl.foodAmount - foodAmount);
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

    public static class Bowl {
        private int foodAmount;

        Bowl(int foodAmount) {
            this.foodAmount = foodAmount;
        }

        public int getFoodAmount() {
            return foodAmount;
        }

        public void setFoodAmount(int foodAmount) {
            this.foodAmount = foodAmount;
        }

        public void addFoodAmount(int foodAmount) {
            this.foodAmount += foodAmount;
        }

        public boolean isEnoughFood(int desiredEatAmount) {
            if (desiredEatAmount <= this.foodAmount) {
                return true;
            } else {
                return false;
            }
        }

        public void massEating(Cat[] catArray) {
            for (int i = 0; i < catArray.length; i++) {
                catArray[i].eat(17, this);
            }
        }
    }
}
