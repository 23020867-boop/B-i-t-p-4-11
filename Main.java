package org.example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S01", "Nguyen Van A", "a@student.edu");
        Student s2 = new Student("S02", "Tran Thi B", "b@student.edu");
        Teacher t1 = new Teacher("T01", "Le Van C", "c@school.edu", "Dr.");
        Advisor a1 = new Advisor("Pham D", "d@company.com");

        KLTN<Student, Teacher> kl1 = new KLTN<>(s1, t1, "AI ứng dụng trong giáo dục");
        KLTN<Student, Advisor> kl2 = new KLTN<>(s2, a1, "Blockchain trong ngân hàng");

        ListSortable<KLTN<?, ?>> list = new ListSortable<>();        list.add(kl1);
        list.add(kl2);

        System.out.println("=== Danh sách trước khi sắp xếp ===");
        list.print();

        System.out.println("\n=== Danh sách sau khi sắp xếp theo tên khóa luận ===");
        list.sort();
        list.print();
    }
}
