class Hufflepuff extends Hogwarts {

    final private int industriousness;
    final private int faithfulness;
    final private int honest;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int industriousness,
                      int faithfulness, int honest) {
        super(name, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.faithfulness = faithfulness;
        this.honest = honest;
    }
    @Override
    public String toString() {
        return String.format(
                        "Имя: %s\n" +
                        "Cила магии: %d\n" +
                        "Дальность Трансгрессии: %d\n" +
                        "Трудолюбие: %d\n" +
                        "Верность: %d\n" +
                        "Честность: %d\n",
                this.name, this.powerOfMagic, this.transgressionDistance, this.industriousness,
                this.faithfulness, this.honest);
    }
    @Override
    public void compareStudentsCharacter(Hogwarts student) {
        Hufflepuff stu = (Hufflepuff) student;
        int firstStrong = this.industriousness + this.faithfulness + this.honest;
        int secondStrong = stu.industriousness + stu.faithfulness + stu.honest;

        if (firstStrong > secondStrong)
            System.out.printf("%s лучший пуффендуец чем %s%n",this.name,student.name);
        else if (firstStrong < secondStrong)
            System.out.printf("%s лучший пуффендуец чем %s%n",student.name,this.name);
        else
            System.out.println("Ученики имеют одинаковый потенциал");
    }
}
