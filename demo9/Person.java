package org.acme;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.FullTextField;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;

@Indexed
public class Person {
    @FullTextField
    String name;

    @FullTextField
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surname=" + surname + "]";
    }
}