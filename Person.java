import java.util.Date;

public class Person {

    private final String name;
    private final Date birthday;

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

    public int getAge(){
        Date today = new Date();
        return (int) ((today.getTime()-getBirthday().getTime())/(1000*60*60*24*365.25));
    }
}
