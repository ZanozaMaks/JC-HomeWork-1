import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value1 = 33;
        changeValue1(value1);
        System.out.println(value1);

        int value2 = 33;
        changeValue2(value2);
        System.out.println(value2);

        Integer[] value3 = new Integer[]{3,4};
        changeValue3(value3);
        System.out.println(Arrays.toString(value3));

        Integer[] value4 = new Integer[]{3,4};
        changeValue4(value4);
        System.out.println(Arrays.toString(value4));

        Person person5 = new Person();
        person5.name = "Lyapis";
        person5.surname = "Trubetskoy";
        changePerson5(person5);
        System.out.println(person5);

        Person person6 = new Person();
        person6.name = "Lyapis";
        person6.surname = "Trubetskoy";
        changePerson6(person6);
        System.out.println(person6);
    }

    public static void changeValue1(int value) {
        value = 22;
//        System.out.println(value); // нужно для вывода changeValue
    }

    public static void changeValue2(Integer value) {
        value = 22;
    }
    public static void changeValue3(Integer[] value) {
        value = new Integer[]{1,2};
    }
    public static void changeValue4(Integer[] value) {
        value [0] = 99;
    }
    public static void changePerson5(Person person) {
        Person newPerson = new Person();
        newPerson.name = "Ilya";
        newPerson.surname = "Lagutenko";
        person = newPerson;
    }
    public static void changePerson6(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
}