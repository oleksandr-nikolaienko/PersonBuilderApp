package main.ArrayHelper;

import main.Interfaces.*;
import main.Person.Person;
import java.util.HashSet;
import java.util.Set;

public class ArrayHelper implements ArrayHelperInterface {

    @Override
    public Person[] merge(Person[] array1, Person[] array2) {
        int totalArrayLength = array1.length + array2.length;
        Person[] totalArray = new Person[totalArrayLength];
        System.arraycopy(array1, 0, totalArray, 0, array1.length);
        System.arraycopy(array2, 0, totalArray, array1.length, array2.length);
        
        return totalArray;
    }

    @Override
    public Person[] removeDuplicates(Person[] array) {
        Set<Person> noDuplicateSet = new HashSet<Person>();
        for (Person p : array) {
            if (!noDuplicateSet.contains(p)) {
                noDuplicateSet.add(p);
            }
        }
        return noDuplicateSet.toArray(new Person[noDuplicateSet.size()]);
    }
}
