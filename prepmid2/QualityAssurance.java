package prepmid2;

public class QualityAssurance extends Vacancy{
    public String needTechnologies;
    public String nameOfPetProject;

    public QualityAssurance(int salary, String needMajority, String needTechnologies, String nameOfPetProject){
        super(salary, needMajority);
        this.needTechnologies = needTechnologies;
        this.nameOfPetProject = nameOfPetProject;
    }

    @Override
    public void interview() {
        System.out.println("U looking for the QA-tester vacancy, salary and needed majority is " + salary + " " + needMajority +
                ". If u know this stack of technologies: " + "[" + needTechnologies + "]" + " and have pet project like " +
                nameOfPetProject + " u can join us");
    }
}
