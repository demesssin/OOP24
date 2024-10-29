package Lab2.Task5;


public class PhdStudent extends Person{
    private String researchMagazine;
    public PhdStudent(String name, int age, String researchMagazine){
        super(name, age);
        this.researchMagazine = researchMagazine;
    }
    @Override
    public String getOccupation(){
        return "Phd students research magazine: " + researchMagazine;
    }
    public void setResearchMagazine(String someResearchMagazine){
        researchMagazine = someResearchMagazine;
    }
    public String getResearchMagazine(){
        return researchMagazine;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog){
            System.out.println("Phd Students cant have dog");
        }
        super.assignPet(pet);
    }
}
