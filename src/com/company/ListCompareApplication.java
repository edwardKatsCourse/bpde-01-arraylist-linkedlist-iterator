package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListCompareApplication {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        System.out.println(list1.containsAll(list2));

        List<Person> p1 = new ArrayList<>();
        Person person_1 = new Person(21, "Maria");
        Person person_2 = new Person(25, "Sasha");

        p1.add(person_1);
        p1.add(person_2);

        Person person_3 = new Person(31, "Maria");
        Person person_4 = new Person(35, "Sasha");

        List<Person> p2 = new ArrayList<>();
        p2.add(person_3);
        p2.add(person_4);

        System.out.println("Person compare:");
        System.out.println(p1.containsAll(p2));
    }
}

class Person {

    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

