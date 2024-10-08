
package BonusTaskCv;

public class Tester {
    public static void main(String[] args) {
        User[] arr = new User[15];

        Staff[] staff = {
                new Staff(1, "staff1", "pass1", "Dima", "Gena", 3000, "Math"),
                new Staff(2,"staff2", "pass1", "Dima", "Gena", 2000, "PP1" ),
                new Staff(3, "staff3", "pass1", "Dima", "Gena", 45445, "PP2"),
                new Staff(4, "staff4", "pass1", "Dima", "Gena", 4345, "Calc"),
                new Staff(5, "staff5", "pass1", "Dima", "Gena", 3059, "Algebra")
        };
        Student[] students = {
                new Student(6, "student1", "pass6", "Tom", "Anderson", 3.8, "Math, Physics"),
                new Student(7, "student2", "pass7", "P", "Diddy", 3.6, "History, English"),
                new Student(8, "student3", "pass8", "Taylor", "Swift", 3.9, "Chemistry, Biology"),
                new Student(9, "student4", "pass9", "Laura", "Beyonce", 4.0, "Physics, Biology"),
                new Student(10, "student5", "pass10", "Jay", "Z", 3.7, "English, History")
        };

        User[] users = {
                new User(11, "user1", "pass11", "Alba", "Joss"),
                new User(12, "user2", "pass12", "Max", "Plank"),
                new User(13, "user3", "pass13", "Nilc", "Bor"),
                new User(14, "user4", "pass14", "Chris", "Hart"),
                new User(15, "user5", "pass15", "Brian", "King")
        };

        for (int i = 0; i < staff.length; i++) {
            arr[i] = staff[i];
        }

        for (int i = 0; i < students.length; i++) {
            arr[staff.length + i] = students[i];
        }


        for (int i = 0; i < users.length; i++) {
            arr[staff.length + students.length + i] = users[i];
        }

         for (User u : arr){
            System.out.println(u.getData());
        }

        for (User u : arr) {
            if (u instanceof Student) {
                // Staff staffMember = (Staff) u;
                Student studData = (Student) u;
                System.out.println(studData.getData());
            }
        }

        Student stover = new Student(6, "student1", "pass6", "Tom", "Anderson", 3.8, "Math, Physics");
        stover.getData();



        

    }
}
