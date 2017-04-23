/**
 * Created by Ирина on 23.04.17.
 */
public enum Day {
    Monday("Mon", true),
    Tuesday("Tue", true),
    Wednesday("Wed", true),
    Thursday("Thu", true),
    Friday("Fri", true),
    Saturday("Sat", false),
    Sunday("Sun", false);
    private String abbr;
    private boolean workingDay;

    private Day(String abbr, boolean workingDay) {
        this.abbr = abbr;
        this.workingDay = workingDay;

    }

    public String getAbbr() {
        return abbr;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }
}
