
public class Student {
    private String name;
    private int dayOfBirthday;
    private int monthOfBirthday;
    private int yearOfBirthday;
    private int amountOfMarks = 8;
    private double []marks = new double[amountOfMarks];
    private int course;
    private int group;


    public int getDayOfBirthday() {
        return dayOfBirthday;
    }


    public void setDayOfBirthday(int dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    public int getMonthOfBirthday() {
        return monthOfBirthday;
    }

    public void setMonthOfBirthday(int monthOfBirthday) {
        this.monthOfBirthday = monthOfBirthday;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    public int getAmountOfMarks() {
        return amountOfMarks;
    }

    public double getMarks(int index) {
        if(index<0||index >= amountOfMarks) return 0;
        return marks[index];
    }

    public void setMarks(int index, double data) {
        if (index<0 || index>=amountOfMarks) return;
        marks[index] = data;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
