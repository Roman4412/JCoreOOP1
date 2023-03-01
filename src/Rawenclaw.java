class Rawenclaw extends Hogwarts{
    final private int smart;
    final private int wisdom;
    final private int wittiness;
    final private int creativity;

    public Rawenclaw(String name, int powerOfMagic, int transgressionDistance, int smart,
                     int wisdom, int wittiness, int creativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }
    @Override
    public String toString() {
        return String.format(
                        "Имя: %s\n" +
                        "Cила магии: %d\n" +
                        "Дальность Трансгрессии: %d\n" +
                        "Ум: %d\n" +
                        "Мудрость: %d\n" +
                        "Остроумие: %d\n" +
                        "Креативность: %d\n",
                this.name, this.powerOfMagic, this.transgressionDistance, this.smart,
                this.wisdom, this.wittiness, this.creativity);
    }
@Override
    public void compareStudentsCharacter(Hogwarts student) {
        Rawenclaw stu = (Rawenclaw) student;
        int firstStrong = this.smart + this.wisdom + this.wittiness + this.creativity;
        int secondStrong = stu.smart + stu.wisdom + stu.wittiness + stu.creativity;

        if (firstStrong > secondStrong)
            System.out.printf("%s лучший когтевранец чем %s%n",this.name,student.name);
        else if (firstStrong < secondStrong)
            System.out.printf("%s лучший когтевранец чем %s%n",student.name,this.name);
        else
            System.out.println("Ученики имеют одинаковый потенциал");
    }
}
