package MyUtils;

import java.util.Random;

public final class generateName {

    public static String[] generateName() {
        String[] fio = new String[3];
        Random rnd = new Random();
        if (rnd.nextInt(2) == 1) {
            fio = generateNameM();
        } else {
            fio = generateNameF();
        }
        return fio;
    }

    public static String[] generateNameM() {
        String[] fio = new String[3];
        Random rnd = new Random();

        String[] mFirstName = {"Маринато", "Игорь", "Вячаслав", "Георгий", "Далер", "Магомед", "Антон", "Александр", "Юрий", "Пётр", "Сослан"};
        String[] mLastName = {"Гильерме", "Дивеев", "Караваев", "Джикия", "Кузяев", "Оздоев", "Миранчук", "Ерохин", "Жирков", "Джамаев", "Акинфеев"};
        String[] mMidName = {"Геннадьевич", "Игоревич", "Вячеславович", "Георгиевич", "Васильевич", "Магомедович", "Антонович", "Александрович", "Юрьевич", "Петрович", "Сосланович"};
        fio[0] = mLastName[rnd.nextInt(mLastName.length)];
        fio[1] = mFirstName[rnd.nextInt(mFirstName.length)];
        fio[2] = mMidName[rnd.nextInt(mMidName.length)];
        return fio;
    }

    public static String[] generateNameF() {
        String[] fio = new String[3];
        Random rnd = new Random();

        String[] fFirstName = {"Татьяна", "Анастасия", "Юлия", "Ксения", "Анна", "Мария", "Маргарита", "Кристина", "Наталья", "Надежда", "Елена"};
        String[] fLastName = {"Щербак", "Ананьева", "Гриченко", "Котельникова", "Кожникова", "Алексеева", "Мануйлова", "Машкова", "Машина", "Смирнова", "Костарева"};
        String[] fMidName = {"Геннадьевна", "Игорьевна", "Вячеславовна", "Георгиевна", "Васильевна", "Магомедовна", "Антоновна", "Александровна", "Юрьевна", "Петровна", "Михаиловна"};

        fio[0] = fLastName[rnd.nextInt(fLastName.length)];
        fio[1] = fFirstName[rnd.nextInt(fFirstName.length)];
        fio[2] = fMidName[rnd.nextInt(fMidName.length)];

        return fio;
    }
}
