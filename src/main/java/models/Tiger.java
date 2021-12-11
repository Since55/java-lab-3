package models;

public class Tiger extends Cat {

    private int numOfEatenEmployee;

    public Tiger() {
        super();
    };
    public Tiger(int age, double weight, String name, String color, Categories CATegory, int numOfEatenEmployee) {
        super(age, weight, name, color, CATegory);
        this.numOfEatenEmployee = numOfEatenEmployee;
    }

    public int getNumOfEatenEmployee() {
        return numOfEatenEmployee;
    }

    public void setNumOfEatenEmployee(int numOfEatenEmployee) {
        this.numOfEatenEmployee = numOfEatenEmployee;
    }

    @Override
    public String toString() {
        return super.toString() + " NumOfEatenEmployees: "+ numOfEatenEmployee;
    }
}
