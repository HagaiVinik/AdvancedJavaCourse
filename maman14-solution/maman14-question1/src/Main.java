public class Main {
    public static void main(String[] args)
    {
        SortedGroup<Student> group = new SortedGroup<Student>();
        group.add(new Student("Hagai", "312153408", 100));
        group.add(new Student("Daniel", "312474208", 90));
        group.add(new Student("Roee", "312223408", 90));
        group.add(new Student("Elad", "337153348", 80));
        group.add(new Student("David", "313467408", 70));

        Student hagai2 = new Student("Hagai2", "314453408", 100);
        group.add(hagai2);
        group.remove(hagai2);

        Student mosheStudent = new Student("Moshe", "324145632", 85);
        SortedGroup<Student> reducedGroup = Reduce.reduce(group, mosheStudent);
        System.out.println(reducedGroup);
    }
}