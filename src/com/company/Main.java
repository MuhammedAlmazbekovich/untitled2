package com.company;

import com.company.building.Address;

public class Main {
    public static void main(String [] args){
        Person father1 = new Person("Аскар Акаев", 77 ,"Отец");
        Person mother1 = new Person("Майрам Акаева",74 , "Мать");
        Person son1 = new Person("Айдар Акаев", 46 , "Сын");


        Family family1 = new Family(new Person[]{father1, mother1,son1});

        Person father2 = new Person("Курманбек Бакиев ",72,"Отец");
        Person mother2 = new Person("Татьяна Бакиева",68 , "Мать");
        Person son2 = new Person("Максим Бакиев",44 , "Сын");

        Family family2 = new Family(new Person[]{father2, mother2,son2});

        Person father3 = new Person("Алмазбек Атамбаев" , 65 , "Отец");
        Person mother3 = new Person("Раиса Атамбаева",60 , "Мать");
        Person daughter3 = new Person("Алия Шагиева", 24, "дочь");

        Family family3 = new Family(new Person[]{father3,mother3,daughter3});

        Address kvartira = new Address("Московская обл. город Москва , улица Новомарьинская 19", new Family[]{family1});
        Address gostinica = new Address("Джалал-Абад обл. город Джалал-Абад, улица Масадан",new Family[]{family2});
        Address obshaga = new Address("Чуйская область, город Бишкек, улица Краснадонцева 2", new Family[]{family3});

        family1.Live();
        System.out.println(family1.toString());
        System.out.println("Место проживания - " +  kvartira);
        family1.PayKomUslugi();

        System.out.println("-------------------------------------------------------------------");

        family2.Live();
        System.out.println(family2.toString());
        System.out.println(gostinica);
        family2.PayArenda();

        System.out.println("-------------------------------------------------------------------");

        family3.Live();
        System.out.println(family3.toString());
        System.out.println(obshaga);
        family3.PayArenda();














    }
}