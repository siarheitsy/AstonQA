public class TimeInterval {

    private boolean isOpened;
    private int startTimeHours;
    private int startTimeMinutes;
    private int endTimeHours;
    private int endTimeMinutes;

    TimeInterval(int startTimeHours, int startTimeMinutes, int endTimeHours, int endTimeMinutes) {
        this.startTimeHours = startTimeHours;
        this.startTimeMinutes = startTimeMinutes;
        this.endTimeHours = endTimeHours;
        this.endTimeMinutes = endTimeMinutes;
        this.isOpened = true;
    }

    public boolean getOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public int getStartTimeHours() {
        return startTimeHours;
    }

    public int getStartTimeMinutes() {
        return startTimeMinutes;
    }

    public int getEndTimeHours() {
        return endTimeHours;
    }

    public int getEndTimeMinutes() {
        return endTimeMinutes;
    }

    public void setStartTimeHours(int startTimeHours) {
        if (checkHours(startTimeHours)) {
            this.startTimeHours = startTimeHours;
        } else {
            this.startTimeHours = -1;
        }
    }

    public void setStartTimeMinutes(int startTimeMinutes) {
        if (checkMinutes(startTimeMinutes)) {
            this.startTimeMinutes = startTimeMinutes;
        } else {
            this.startTimeMinutes = -1;
        }
    }

    public void setEndTimeHours(int endTimeHours) {
        if (checkHours(endTimeHours)) {
            this.endTimeHours = endTimeHours;
        } else {
            this.endTimeHours = -1;
        }
    }

    public void setEndTimeMinutes(int endTimeMinutes) {
        if (checkMinutes(endTimeMinutes)) {
            this.endTimeMinutes = endTimeMinutes;
        } else {
            this.endTimeMinutes = -1;
        }
    }

    public String getStartTimeString() {
        if (!(checkHours(this.startTimeHours)) || !(checkMinutes(this.startTimeMinutes))) {
            return "Некорректное значение времени";
        }
        String startTime;
        if (this.startTimeHours >= 0 && this.startTimeHours <= 10) {
            startTime = Integer.toString(this.startTimeHours) + Integer.toString(this.startTimeHours);
        } else {
            startTime = Integer.toString(this.startTimeHours);
        }
        if (this.startTimeMinutes >= 0 && this.startTimeMinutes <= 10) {
            startTime += ":" + Integer.toString(this.startTimeMinutes) + Integer.toString(this.startTimeMinutes);
        } else {
            startTime += ":" + Integer.toString(this.startTimeMinutes);
        }
        return startTime;
    }

    public String getEndTimeString() {
        if (!(checkHours(this.endTimeHours)) || !(checkMinutes(this.endTimeMinutes))) {
            return "Некорректное значение времени";
        }
        String endTime;
        if (this.endTimeHours >= 0 && this.endTimeHours <= 10) {
            endTime = Integer.toString(this.endTimeHours) + Integer.toString(this.endTimeHours);
        } else {
            endTime = Integer.toString(this.endTimeHours);
        }
        if (this.endTimeMinutes >= 0 && this.endTimeMinutes <= 10) {
            endTime += ":" + Integer.toString(this.endTimeMinutes) + Integer.toString(this.endTimeMinutes);
        } else {
            endTime += ":" + Integer.toString(this.endTimeMinutes);
        }
        return endTime;
    }

    public boolean checkHours(int hours) {
        if (hours >= 0 || hours <= 23) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMinutes(int minutes) {
        if (minutes >= 0 || minutes <= 59) {
            return true;
        } else {
            return false;
        }
    }

}
