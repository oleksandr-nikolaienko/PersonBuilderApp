package main.PersonBuilderApp;


import main.Enums.Profession;
import main.Person.Person;
import main.ServiceDelegate.ServiceDelegate;
import main.ArrayHelper.*;

public class PersonBuilderApp {

    public static void main(String[] args) {
        
        Person p1 = new Person.Builder().
                firstName("Oleksandr").
                lastName("Nikolaienko").
                eMail("oleksandr.nikolaenko@gmail.com").
                profession(Profession.DEV).
                build();
        
        Person p2 = new Person.Builder().
                firstName("Someone").
                lastName("Else").
                eMail("oleksandr.nikolaenko@gmail.com").
                profession(Profession.QA).
                build();
        
        Person p3 = new Person.Builder().
                firstName("Another").
                lastName("One").
                eMail("oleksandr.nikolaenko@gmail.com").
                profession(Profession.DIR).
                build();
        
        Person p4 = new Person.Builder().
                firstName("Oleksandr").
                lastName("Nikolaienko").
                eMail("oleksandr.nikolaenko@gmail.com").
                profession(Profession.DEV).
                build();
        
        Person[] persons1 = {p1, p2, p3, p4};
        Person[] persons2 = {p3, p2, p1, p4};
        
        ServiceDelegate mServiceDelegate = new ServiceDelegate(new ArrayHelper());
        mServiceDelegate.printMergedArrays(persons1, persons2);
    }    
}
