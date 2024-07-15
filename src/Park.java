public class Park {

    public String parkName;

    Park(String name) {
        this.parkName = name;
    }

    public class Attraction {

        private String attractionName;
        private TimeInterval[] workTime;
        private TimeInterval[] breakTime;
        private float price;

        Attraction(String name, int startWorkHours, int startWorkMinutes, int endWorkHours, int endWorkMinutes, int startBreakHours, int startBreakMinutes, int endBreakHours, int endBreakMinutes, float price, int[] nonWorkingDays) {
            this.attractionName = name;
            this.price = price;
            workTime = new TimeInterval[7];
            for (int i = 0; i < 7; i++) {
                workTime[i] = new TimeInterval(startWorkHours, startWorkMinutes, endWorkHours, endWorkMinutes);
            }
            breakTime = new TimeInterval[7];
            for (int i = 0; i < 7; i++) {
                breakTime[i] = new TimeInterval(startBreakHours, startBreakMinutes, endBreakHours, endBreakMinutes);
            }
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < nonWorkingDays.length; j++) {
                    if (nonWorkingDays[j] == i) {
                        workTime[i].setOpened(false);
                        breakTime[i].setOpened(false);
                    }
                }
            }

        }

        public void printInfo() {
            String output = "\nНазвание: " + this.attractionName + "\nЦена: " + Float.toString(this.price) + "\nВремя работы: ";
            for (int i = 0; i < 7; i++) {
                switch (i) {
                    case 0:
                        output += "\n\nПонедельник: ";
                        break;
                    case 1:
                        output += "\n\nВторник: ";
                        break;
                    case 2:
                        output += "\n\nСреда: ";
                        break;
                    case 3:
                        output += "\n\nЧетверг: ";
                        break;
                    case 4:
                        output += "\n\nПятница: ";
                        break;
                    case 5:
                        output += "\n\nСуббота: ";
                        break;
                    case 6:
                        output += "\n\nВоскресенье: ";
                        break;
                }
                if (!workTime[i].getOpened()) {
                    output += "\nНе работает";
                } else {
                    output += "\nОт " + workTime[i].getStartTimeString() + " до " + workTime[i].getEndTimeString() + "\nПерерыв с " + breakTime[i].getStartTimeString() + " до " + breakTime[i].getEndTimeString();
                }
                System.out.println(output);
            }
        }

    }

}
