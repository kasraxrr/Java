import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<Person> people;

        Scanner keyboard = new Scanner(System.in);

        people = new ArrayList<>();

        System.out.println("enter your name : ");
        String name = keyboard.nextLine();

        System.out.println("enter your Address : ");
        String address = keyboard.nextLine();
        Home home = new House(address, 100);
        Person person1 = new Person(name, home);
        people.add(person1);


        System.out.println("enter your 2 name : ");
        String name2 = keyboard.nextLine();

        System.out.println("enter your 2 Address : ");
        String address2 = keyboard.nextLine();
        Home home2 = new Apartment(address2, 200);
        Person person2 = new Person(name2, home2);
        people.add(person2);


        System.out.println("enter your 3 name : ");
        String name3 = keyboard.nextLine();

        System.out.println("enter your 3 Address : ");
        String address3 = keyboard.nextLine();
        Home home3 = new House(address3, 300);
        Person person3 = new Person(name3, home3);
        people.add(person3);

        for (int i=0;i<people.size();i++){
            System.out.println(people.get(i).getHomeInfo());
        }












    }
}
