public class Monkey extends RescueAnimal {

    // instance variable
    private String tailLength;
    private String height;
    private String bodyLength;
    private String species;

    //constructor
    public Monkey(String name, String tailLength, String height, String bodyLength, String species, 
    String gender, String age, String weight, String acquisitionDate, String acquisitionCountry,
    String trainingStatus, boolean reservation, String serviceCountry) {
        setName(name);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reservation);
        setInServiceCountry(serviceCountry);
    }
    
    //Accessor method
    public String getTailLength() {
        return tailLength;
    }
    public String getHeight() {
        return height;
    }
    public String getBodyLength() {
        return bodyLength;
    }
    public String getSpecies() {
        return species;
    }
    
    //Mutator method
    public void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }
    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }
    public void setBodyLength(String monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }

}