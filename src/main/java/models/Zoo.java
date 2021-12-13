package models;

import comparators.AnimalAgeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Zoo {
    private String _name;
    private List<Animal> animals = new ArrayList<Animal>();

    public String get_name() {
        return _name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> filterByName(String name) {
        List<Animal> result = new ArrayList<Animal>();

        for(int i = 0; i < animals.size();i++){
            if(animals.get(i).getName() == name){
                result.add(animals.get(i));
            }
        }
        return result;
    }
    public List<Animal> filterByNameStream(String name) {
        return animals.stream().filter(n -> n.getName().equals(name)).collect(Collectors.toList());

    }

    public void sortByAge(){
        Collections.sort(animals, new AnimalAgeComparator());
    }

    public List<Animal> sortByAgeStream() {
        return animals.stream().sorted().sorted(new AnimalAgeComparator()).collect(Collectors.toList());
    }
}
