public abstract class Hogwarts {
    final protected int powerOfMagic;
    final protected int transgressionDistance;
    final protected String name;

    protected Hogwarts(String name,int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public static void printStudentInfo(Hogwarts student) {
        if (student == null) {
            throw new IllegalArgumentException("Студент не найден");
        }
        System.out.println(student);
    }

    public static void compareMagicSkillsStudents(Hogwarts firstStudent, Hogwarts secondStudent) {
        int firstStrong = firstStudent.powerOfMagic + firstStudent.transgressionDistance;
        int secondStrong = secondStudent.powerOfMagic + secondStudent.transgressionDistance;

        if (firstStrong > secondStrong)
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s%n",firstStudent.name,secondStudent.name);
        else if (firstStrong < secondStrong)
            System.out.printf("%s обладает бОльшей мощностью магии, чем %s%n",secondStudent.name,firstStudent.name);
        else
            System.out.println("У учеников равные по силе магические способности");

    }
    public abstract void compareStudentsCharacter(Hogwarts student);
}

