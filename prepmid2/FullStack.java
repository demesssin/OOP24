package prepmid2;

public class FullStack extends Vacancy{
    public int workExperience;
    public String companyBelow;

    public FullStack(int salary, String needMajority, int workExperience, String companyBelow){
        super(salary, needMajority);
        this.workExperience = workExperience;
        this.companyBelow = companyBelow;
    }

    @Override
    public void interview() {
        System.out.println("Hello, you are looking for vacancy, salary and need majority is: " + salary + ", " + needMajority +
                "If your work experience not less than " + workExperience + " years u can join us. It would be good if" +
                " you before worked in " + companyBelow);
    }
}
