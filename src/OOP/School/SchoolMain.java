package OOP.School;
public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Van A", 15);
        Student student2 = new Student("Van B", 16);
        Student student3 = new Student("Van C", 17);
        Student student4 = new Student("Van D", 18);
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        Teacher teacher1 = new Teacher("Nguyen Van A", "Math");
        Teacher teacher2 = new Teacher("Le Thi B", "Science");
        Teacher teacher3 = new Teacher("Tran Van C", "History");
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);
        SchoolClass schoolClass1 = new SchoolClass("Math", teacher1);
        schoolClass1.addStudent(student1);
        schoolClass1.addStudent(student2);
        schoolClass1.addStudent(student3);
        schoolClass1.addStudent(student4);
        SchoolClass schoolClass2 = new SchoolClass("Science", teacher2);
        schoolClass2.addStudent(student1);
        schoolClass2.addStudent(student2);
        SchoolClass schoolClass3 = new SchoolClass("History", teacher3);
        schoolClass3.addStudent(student3);
        schoolClass3.addStudent(student4);
        school.addClass(schoolClass1);
        school.addClass(schoolClass2);
        school.addClass(schoolClass3);
        System.out.println("School information: ");
        System.out.println("Number of student: " + school.getStudents().size());
        System.out.println("Number of teacher: " + school.getTeachers().size());
        System.out.println("Number of class: " + school.getClasses().size());
        System.out.println("\nClass Math information: ");
        System.out.println("Class name: " + schoolClass1.getClassName());
        System.out.println("Number of student: " + schoolClass1.getStudents().size());
        System.out.println("Teacher: " + schoolClass1.getTeacher().getName());

        System.out.println("\nClass Science information: ");
        System.out.println("Class name: " + schoolClass2.getClassName());
        System.out.println("Number of student: " + schoolClass2.getStudents().size());
        System.out.println("Teacher: " + schoolClass2.getTeacher().getName());

        System.out.println("\nClass History information: ");
        System.out.println("Class name: " + schoolClass3.getClassName());
        System.out.println("Number of student: " + schoolClass3.getStudents().size());
        System.out.println("Teacher: " + schoolClass3.getTeacher().getName());

        // Remove a student, a teacher, and a class from the school
        school.removeStudent(student1);
        school.removeTeacher(teacher2);
        school.removeClass(schoolClass3);

        // Print updated school information after removal
        System.out.println("School information after removing one student, teacher and class:");
        System.out.println("Number of students: " + school.getStudents().size());
        System.out.println("Number of teachers: " + school.getTeachers().size());
        System.out.println("Number of classes: " + school.getClasses().size());
    }
}