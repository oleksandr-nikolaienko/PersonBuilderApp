package test.ArrayHelperTest;

import static org.junit.Assert.*;
import main.ArrayHelper.ArrayHelper;
import main.Enums.Profession;
import main.Person.*;
import org.junit.Before;
import org.junit.Test;

public class ArrayHelperTest {
    private ArrayHelper arrayHelper;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person[] array1;
    private Person[] array2;
    private Person[] arrayWithDup;
    private Person[] expectedMergedArray;
    private Person[] expectedNoDupArray;
    
    @Before
    public void setUp() throws Exception {
        arrayHelper = new ArrayHelper();
        
        person1 = new Person.Builder().
                firstName("Oleksandr").
                lastName("Nikolaienko").
                eMail("oleksandr.nikolaenko@gmail.com").
                profession(Profession.DEV).
                build();
        
        person2 = new Person.Builder().
                firstName("Someone").
                lastName("Else").
                eMail("oleksandr.nikolaenko@gmail.com").
                profession(Profession.QA).
                build();
        
        person3 = new Person.Builder().
                firstName("Another").
                lastName("One").
                eMail("oleksandr.nikolaenko@gmail.com").
                profession(Profession.DIR).
                build();
        
        array1 = new Person[]{person1, person2};
        array2 = new Person[]{person1, person3};
        arrayWithDup = new Person[]{person1, person1, person1, person3, person3};
        expectedMergedArray = new Person[]{person1, person2, person1, person3};
        expectedNoDupArray = new Person[]{person1, person3};
    }

    @Test
    public void testMerge() {
        Person[] actualArray = arrayHelper.merge(array1, array2);
        assertArrayEquals(actualArray, expectedMergedArray);
    }
    
    @Test
    public void testRemoveDuplicates() {
        Person[] actualArray = arrayHelper.removeDuplicates(arrayWithDup);
        assertArrayEquals(actualArray, expectedNoDupArray);
    }

}
