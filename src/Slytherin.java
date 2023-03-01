
class Slytherin extends Hogwarts{
    final private int cunning;
    final private int resoluteness;
    final private int ambition;
    final private int resourcefulness;
    final private int power;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int resoluteness,
                     int ambition, int resourcefulness, int power) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }
    @Override
    public String toString() {
        return String.format(
                        "Имя: %s\n" +
                        "Cила магии: %d\n" +
                        "Дальность Трансгрессии: %d\n" +
                        "Хитрость: %d\n" +
                        "Решительность: %d\n" +
                        "Амбициозность: %d\n" +
                        "Находчивость: %d\n" +
                        "Жажда власти: %d\n",
                this.name, this.powerOfMagic, this.transgressionDistance, this.cunning,
                this.resoluteness, this.ambition, this.resourcefulness, this.power);
    }


    @Override
    public void compareStudentsCharacter(Hogwarts student) {
        Slytherin stu = (Slytherin) student;
        int firstStrong = this.cunning + this.resoluteness + this.ambition + this.resourcefulness + this.power;
        int secondStrong = stu.cunning + stu.resoluteness + stu.ambition + stu.resourcefulness + stu.power;

        if (firstStrong > secondStrong)
            System.out.printf("%s лучший слизеринец чем %s%n",this.name,student.name);
        else if (firstStrong < secondStrong)
            System.out.printf("%s лучший слизеринец чем %s%n",student.name,this.name);
        else
        System.out.println("Ученики имеют одинаковый потенциал");
    }
}


