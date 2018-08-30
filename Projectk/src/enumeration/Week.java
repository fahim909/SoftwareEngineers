package enumeration;

public class Week {
    Day day;

    public Week() {
    }

    public Week(Day day) {
        this.day = day;
    }

    public void whatToDo(Day day) {
        switch(day) {
            case MONDAY:
                System.out.println("Start working on CodeLab");
                break;
            case TUESDAY:
                System.out.println("Start working on Homerwork");
                break;
            case WEDNESDAY:
                System.out.println("Join Mentoring Session");
                break;
            case THURSDAY:
                System.out.println("Joing Group Discussion");
                break;
            case FRIDAY:
                System.out.println("Submit Homework");
                break;
            case SATURDAY:
                System.out.println("Join Weekend Class-1");
                break;
            case SUNDAY:
                System.out.println("Join Weekened Class-2");
                break;
            default:
                System.out.println("are you kidding no more days");
        }

    }
}