public class Pet {
    
    //Instance fields for Pet
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;
    
    //accesor for Pet
    public Pet() {
        petType = "No type";
        petName = "No name";
        petAge = 0;
        dogSpaces = 0;
        catSpaces = 0;
        daysStay = 0;
        amountDue = 0.0;
    }
    
    //Mutators for Pet
    public String getPetType() {
        return petType;
    }
    public void setPetType(String i) {
        petType = i;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String j) {
        petName = j;
    }
    public int getPetAge() {
        return petAge;
    }
    public void setPetAge(int k) {
        petAge = k;
    }
    public int getDogSpaces() {
        return dogSpaces;
    }
    public void setDogSpaces(int l) {
        dogSpaces = l;
    }
    public int getCatSpaces() {
        return catSpaces;
    }
    public void setCatSpaces(int m) {
        catSpaces = m;
    }
    public int getDaysStay() {
        return daysStay;
    }
    public void setDaysStay(int n) {
        daysStay = n;
    }
    public double getAmountDue() {
        return amountDue;
    }
    public void setAmountDue(double o) {
        amountDue = o;
    }

}