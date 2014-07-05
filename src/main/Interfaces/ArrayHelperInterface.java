package main.Interfaces;

import main.Person.Person;

public interface ArrayHelperInterface {
    public Person[] merge(Person[] array1, Person[] array2);
    
    public Person[] removeDuplicates(Person[] array);
}
