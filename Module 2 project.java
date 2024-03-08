public class Dog {
    
    //Instance Fields
    private String dogName;
    private int dogAge;
    private int dogSpaceNumber;
    private int dogWeight;
    private String grooming;

    //Accessor
    public Dog() {
        dogName = "Nameless";
        dogAge = 0;
        dogSpaceNumber = 0;
        dogWeight = 0;
        grooming = "false";
    }

    //Mutators
    public void dogName(String i) {
        dogName = i;
    }

    public void dogAge(int j) {
        dogAge = j;
    }
    
    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }

    public void setDogSpaceNumber(int x) {
        dogSpaceNumber = x;
    }

    public int getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(int y) {
        dogWeight = y;
    }

    public String getGrooming() {
        return grooming;
    }
    public void setGrooming(String z) {
        grooming = z;
    }

}
