public class TestStudent {
    public static void main(String[] args) {

        Student student1 = new Student("00001234");
        // PROOF 1
        System.out.println("ID" + student1.getStudentId());
        boolean accepted_name = student1.setName("ANDREA");
        System.out.println(accepted_name);
        System.out.println(student1.getName());
        boolean accepted_grade1 = student1.setGrade1(4.8);
        System.out.println(accepted_grade1);
        System.out.println(student1.getGrade1());
        boolean accepted_grade2 = student1.setGrade2(1.5);
        System.out.println(accepted_grade2);
        System.out.println(student1.getGrade2());
        boolean accepted_grade3 = student1.setGrade3(5);
        System.out.println(accepted_grade3);
        System.out.println(student1.getGrade3());
        System.out.println("AVERAGE =" + student1.Average());
        // PROOF 2
        System.out.println("ID" + student1.getStudentId());
        accepted_name = student1.setName("");
        System.out.println(accepted_name);
        System.out.println(student1.getName());
        accepted_grade1 = student1.setGrade1(4.8);
        System.out.println(accepted_grade1);
        System.out.println(student1.getGrade1());
        accepted_grade2 = student1.setGrade2(1.5);
        System.out.println(accepted_grade2);
        System.out.println(student1.getGrade2());
        accepted_grade3 = student1.setGrade3(5);
        System.out.println(accepted_grade3);
        System.out.println(student1.getGrade3());
        System.out.println("AVERAGE =" + student1.Average());
        // PROOF 3
        System.out.println("ID" + student1.getStudentId());
        accepted_name = student1.setName("MARIA");
        System.out.println(accepted_name);
        System.out.println(student1.getName());
        accepted_grade1 = student1.setGrade1(-2);
        System.out.println(accepted_grade1);
        System.out.println(student1.getGrade1());
        accepted_grade2 = student1.setGrade2(-5);
        System.out.println(accepted_grade2);
        System.out.println(student1.getGrade2());
        accepted_grade3 = student1.setGrade3(-2);
        System.out.println(accepted_grade3);
        System.out.println(student1.getGrade3());
        System.out.println("AVERAGE =" + student1.Average());
        // PROOF 4
        System.out.println("ID" + student1.getStudentId());
        accepted_name = student1.setName("ANDREA");
        System.out.println(accepted_name);
        System.out.println(student1.getName());
        accepted_grade1 = student1.setGrade1(-4.8);
        System.out.println(accepted_grade1);
        System.out.println(student1.getGrade1());
        accepted_grade2 = student1.setGrade2(1.5);
        System.out.println(accepted_grade2);
        System.out.println(student1.getGrade2());
        accepted_grade3 = student1.setGrade3(5);
        System.out.println(accepted_grade3);
        System.out.println(student1.getGrade3());
        System.out.println("AVERAGE =" + student1.Average());
        // PROOF 5
        System.out.println("ID" + student1.getStudentId());
        accepted_name = student1.setName("ANDREA");
        System.out.println(accepted_name);
        System.out.println(student1.getName());
        accepted_grade1 = student1.setGrade1(2);
        System.out.println(accepted_grade1);
        System.out.println(student1.getGrade1());
        accepted_grade2 = student1.setGrade2(-1.5);
        System.out.println(accepted_grade2);
        System.out.println(student1.getGrade2());
        accepted_grade3 = student1.setGrade3(6);
        System.out.println(accepted_grade3);
        System.out.println(student1.getGrade3());
        System.out.println("AVERAGE =" + student1.Average());
        // PROOF 6
        System.out.println("ID" + student1.getStudentId());
        accepted_name = student1.setName("ANDREA");
        System.out.println(accepted_name);
        System.out.println(student1.getName());
        accepted_grade1 = student1.setGrade1(4);
        System.out.println(accepted_grade1);
        System.out.println(student1.getGrade1());
        accepted_grade2 = student1.setGrade2(3.8);
        System.out.println(accepted_grade2);
        System.out.println(student1.getGrade2());
        accepted_grade3 = student1.setGrade3(-5);
        System.out.println(accepted_grade3);
        System.out.println(student1.getGrade3());
        System.out.println("AVERAGE =" + student1.Average());
    }
}
