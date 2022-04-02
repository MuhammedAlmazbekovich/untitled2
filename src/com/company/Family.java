package com.company;

import com.company.payandlive.Liveable;
import com.company.payandlive.Payable;

import java.util.Arrays;

public class Family implements Payable, Liveable {
    Person[] people;

    public Family(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return  Arrays.toString(people);
    }


    @Override
    public void Live() {
        int sumOfPeople = 0;
        int count = 0;
        for (Person person: people) {
            count++;
        }
        System.out.println("Уй булоодо" + " "+ count +" "+ "адам жашайт");
    }

    @Override
    public void PayArenda() {
        System.out.println("Общагада жана гостиницада  жашагандар аренда толошот");
    }

    @Override
    public void PayKomUslugi() {
        System.out.println("Квартирада жашагандар ком.услуги толошот");

    }



}
