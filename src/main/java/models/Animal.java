package models;

public class Animal implements Comparable<Animal>{

    protected String name;
    protected double weight;
    protected int age;

    public Animal() {};
    public Animal(int age, double weight, String name) {
        if (age > 0)
            this.age = age;
        if (weight > 0)
            this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }
    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name + ", " + age + " years, " + weight + "kg, ";
    }

    @Override
    public int compareTo(Animal a) {
        if (age == a.age) {
            if (weight == a.weight) {
                if (name.length() == a.name.length()) {
                    return name.compareTo(a.name);
                }
                return name.length() - a.name.length();
            }
            return (int)(weight - a.weight);
        }
        return age - a.age;
    }
}