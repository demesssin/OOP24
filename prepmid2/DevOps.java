package prepmid2;

public class DevOps extends Vacancy {
    public String level;
    public int solvedProblems;

    public DevOps(int salary, String needMajority, String level, int solvedProblems){
        super(salary, needMajority);
        this.level = level;
        this.solvedProblems = solvedProblems;
    }

    @Override
    public void interview() {
        System.out.println("You looking for DevOps vacancy, salary and needed major is: " + salary + " " + needMajority +
                ". You can join our team if your level is " + level + " and " + solvedProblems + " at LeetCode");
    }
}
