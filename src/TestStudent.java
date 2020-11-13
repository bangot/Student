public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("bang");
        Student b = new Student();
        b.setId(2);
        b.setName("nghia ");
        Student[] students = new Student[0];
        students = s.add(students, s);
        students = b.add(students, b);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].showInfo());
        }
    }
}