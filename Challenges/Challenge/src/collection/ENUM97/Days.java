package collection.ENUM97;

public enum Days {
    monday(true),
    tuesday(true),
    wednesday(true),
    thirsday(true),
    friday(true),
    sadturay(false);


    private final boolean isweekday;

     Days(boolean isweekday){
        this.isweekday = isweekday;
    }

    public String getType() {
        return isweekday ? "weekday": "weekend";
    }
}
