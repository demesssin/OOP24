package prepmid2;

import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Vector<Vacancy> vacancies = new Vector<>();

        Vacancy devops = new DevOps(1200000, "Master", "Senior", 200);
        Vacancy fullstack = new FullStack(1000000, "Bachelor", 3, "NFactrial");
        Vacancy qatest = new QualityAssurance(700000, "Bachelor", "Gitlab, Jenkins", "Library");

        vacancies.add(devops);
        vacancies.add(fullstack);
        vacancies.add(qatest);

        for (Vacancy vacancy : vacancies){
            vacancy.interview();
        }
    }
}
