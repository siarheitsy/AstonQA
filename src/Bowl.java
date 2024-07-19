public class Bowl {

        private static Bowl bowlInstance;
        private int foodAmount;

        private Bowl(int foodAmount) {
            this.foodAmount = foodAmount;
        }

        public static Bowl getBowlInstance(int foodAmount){ // #3
            if(bowlInstance == null){		//если объект еще не создан
                bowlInstance = new Bowl(foodAmount);	//создать новый объект
            }
            return bowlInstance;		// вернуть ранее созданный объект
        }

        public int getFoodAmount() {
            return bowlInstance.foodAmount;
        }

        public void setFoodAmount(int foodAmount) {
            bowlInstance.foodAmount = foodAmount;
        }

        public void addFoodAmount(int foodAmount) {
            bowlInstance.foodAmount += foodAmount;
        }

        public boolean isEnoughFood(int desiredEatAmount) {
            if (desiredEatAmount <= bowlInstance.foodAmount) {
                return true;
            } else {
                return false;
            }
        }

        public void massEating(Cat[] catArray) {
            for (int i = 0; i < catArray.length; i++) {
                catArray[i].eat(17, bowlInstance);
            }
        }
}
