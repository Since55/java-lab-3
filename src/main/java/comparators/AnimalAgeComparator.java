package comparators;

import java.util.Comparator;

import models.*;
public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        return a1.getAge() - a2.getAge();
    }
}