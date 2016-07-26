import java.util.Date;

public class Person {

    private final String name;
    private final Date birthday;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        Date today = new Date();
        return (int) (milliSecondsToYear(today.getTime() - getBirthday().getTime()));
    }

    private int milliSecondsToYear(long milliseconds) {
        return (int) (milliseconds /  MILLISECONDS_PER_YEAR);
    }
}
