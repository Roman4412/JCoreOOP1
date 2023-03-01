
class Gryffindor extends Hogwarts  {
    final private int nobleness;
    final private int honor;
    final private int courage;

    public Gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobleness, int honor, int courage) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return String.format(
                        "Имя: %s\n" +
                        "Cила магии: %d\n" +
                        "Дальность Трансгрессии: %d\n" +
                        "Благородство: %d\n" +
                        "Честь: %d\n" +
                        "Храбрость: %d\n",
                this.name, this.powerOfMagic, this.transgressionDistance,
                this.nobleness, this.honor, this.courage);
    }
    @Override
    public void compareStudentsCharacter(Hogwarts student) {
        Gryffindor stu = (Gryffindor) student;
        int firstStrong = this.nobleness + this.honor + this.courage;
        int secondStrong = stu.nobleness + stu.honor + stu.courage;

        if (firstStrong > secondStrong)
            System.out.printf("%s лучший гриффиндорец чем %s%n",this.name,student.name);
        else if (firstStrong < secondStrong)
            System.out.printf("%s лучший гриффиндорец чем %s%n",student.name,this.name);
        else
        System.out.println("Ученики имеют одинаковый потенциал");
    }

}
