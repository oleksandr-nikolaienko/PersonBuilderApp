package main.ServiceDelegate;

import java.util.Arrays;
import main.ArrayHelper.*;
import main.Person.*;

public class ServiceDelegate {
    private final ArrayHelper arrayHelper;
    
    public ServiceDelegate(ArrayHelper arrayHelper) {
        this.arrayHelper = arrayHelper;
    }
    
    public void printMergedArrays(Person[] array1, Person[] array2) {
        System.out.println("Array1: " + Arrays.toString(array1) + ""
                + "\nArray2: " + Arrays.toString(array2)); 
        
        Person[] mergedArrays = arrayHelper.merge(array1, array2);
        Person[] mergedArraysNoDuplicates = arrayHelper.removeDuplicates(mergedArrays);
        
        System.out.println("\nLength of Merged Arrays: " + mergedArrays.length);
        System.out.println("Merged Arrays: " + Arrays.toString(mergedArrays));
        System.out.println("\nLength of Merged Arrays without duplicates: " + mergedArraysNoDuplicates.length);
        System.out.println("Merged Arrays without duplicates: " + Arrays.toString(mergedArraysNoDuplicates));
    }
}
