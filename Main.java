import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person miPerson = new Person("Enrique",new Date(64,6,27));
        System.out.println(miPerson.getName() +  " tiene " + miPerson.getAge() + " años.");

        Person miPerson1 = new Person("Ana",new Date(64,6,26));
        System.out.println(miPerson1.getName() +  " tiene " + miPerson1.getAge() + " años.");

    }
}
