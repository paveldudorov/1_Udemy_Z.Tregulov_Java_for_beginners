package HomeWork.Lesson_4;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;
}
class StudentTest {
    public static void main(String[] args) {
        Student st1 =new Student();
        st1.studentId = 1;
        st1.name = "Ivan";
        st1.surname = "Ivanov";
        st1.course = 5;
        st1.mathAverageGrade = 5.5;
        st1.economicsAverageGrade = 4.4;
        st1.foreignLanguageAverageGrade = 7.7;

        Student st2 =new Student();
        st2.studentId = 1;
        st2.name = "Petr";
        st2.surname = "Petrov";
        st2.course = 4;
        st2.mathAverageGrade = 4.5;
        st2.economicsAverageGrade = 3.4;
        st2.foreignLanguageAverageGrade = 6.7;

        Student st3 =new Student();
        st3.studentId = 1;
        st3.name = "Sidr";
        st3.surname = "Sidorov";
        st3.course = 6;
        st3.mathAverageGrade = 7.5;
        st3.economicsAverageGrade = 8.4;
        st3.foreignLanguageAverageGrade = 9.7;

    System.out.println("Средняя арифметическая оценка студента " + st1.name + " " + st1.surname + "=" +
            (st1.mathAverageGrade+ st1.economicsAverageGrade+ st1.foreignLanguageAverageGrade) / 3);
        System.out.println("Средняя арифметическая оценка студента " + st2.name + " " + st2.surname + "=" +
                (st2.mathAverageGrade+ st2.economicsAverageGrade+ st2.foreignLanguageAverageGrade) / 3);
        System.out.println("Средняя арифметическая оценка студента " + st3.name + " " + st3.surname + "=" +
                (st3.mathAverageGrade+ st3.economicsAverageGrade+ st3.foreignLanguageAverageGrade) / 3);
    }
}