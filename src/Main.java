public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Гарри Поттер", 98, 90, 90, 87, 85);
        Gryffindor granger = new Gryffindor("Гермиона Грейнджер", 86, 69, 67, 54, 64);
        Gryffindor weasley = new Gryffindor("Рон Уизли", 34, 45, 69, 50, 35);

        Slytherin malfoy = new Slytherin("Драко Малфой", 70, 83, 56, 20, 39, 68, 79);
        Slytherin montagu = new Slytherin("Грэхэм Монтегю", 30, 33, 26, 40, 19, 38, 19);
        Slytherin goyle = new Slytherin("Грегори Гойл", 40, 23, 21, 34, 12, 18, 28);

        Rawenclaw chang = new Rawenclaw("Чжоу Чанг", 54, 66, 69, 54, 39, 25);
        Rawenclaw patil = new Rawenclaw("Падма Патил", 64, 36, 49, 64, 20, 45);
        Rawenclaw belby = new Rawenclaw("Маркус Белби", 34, 36, 80, 34, 31, 15);

        Hufflepuff smith = new Hufflepuff("Захария Смит", 64, 52, 34, 60, 70);
        Hufflepuff diggory = new Hufflepuff("Седрик Диггори", 83, 52, 64, 70, 80);
        Hufflepuff fletchley = new Hufflepuff("Джастин Финч-Флетчли", 44, 22, 64, 20, 70);

        Hogwarts.printStudentInfo(malfoy);
        potter.compareStudentsCharacter(granger);
        malfoy.compareStudentsCharacter(goyle);
        chang.compareStudentsCharacter(belby);
        smith.compareStudentsCharacter(diggory);
        Hogwarts.compareMagicSkillsStudents(malfoy, diggory);
    }
}