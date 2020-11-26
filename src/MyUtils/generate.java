package MyUtils;

import java.util.Random;

public final class generate {

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

        String[] mFirstName = {"Маринато", "Игорь", "Вячаслав", "Георгий", "Далер", "Магомед", "Антон", "Александр", "Юрий", "Пётр",
                "Сослан", "Иван", "Роман", "Сергей", "Павел", "Максим", "Аслан", "Марк", "Денис", "Тимур", "Василий", "Мага",
                "Евгений", "Геннадий"};
        String[] mLastName = {"Гильерме", "Дивеев", "Караваев", "Джикия", "Кузяев", "Оздоев", "Миранчук", "Ерохин",
                "Жирков", "Джамаев", "Акинфеев", "Салаваев", "Попов", "Петров", "Иванов", "Козлов", "Папаев",
                "Жихарев", "Зайцев", "Парусов", "Сосницкий", "Богачев"};
        String[] mMidName = {"Геннадьевич", "Игоревич", "Вячеславович", "Георгиевич", "Васильевич", "Магомедович", "Антонович", "Александрович", "Юрьевич", "Петрович", "Сосланович"};
        fio[0] = mLastName[rnd.nextInt(mLastName.length)];
        fio[1] = mFirstName[rnd.nextInt(mFirstName.length)];
        fio[2] = mMidName[rnd.nextInt(mMidName.length)];
        return fio;
    }

    public static String[] generateNameF() {
        String[] fio = new String[3];
        Random rnd = new Random();

        String[] fFirstName = {"Татьяна", "Анастасия", "Юлия", "Ксения", "Анна", "Мария", "Маргарита", "Кристина", "Наталья", "Надежда",
                "Елена", "Светлана", "Ольга", "Татьяна", "Евгения", "Вера", "Любовь", "Надежда", "Лилия", "Дарья",
                "Яна", "Галина"};
        String[] fLastName = {"Щербак", "Ананьева", "Гриченко", "Котельникова", "Кожникова", "Алексеева", "Мануйлова", "Машкова", "Машина",
                "Смирнова", "Костарева", "Косарева", "Салаваева", "Попова", "Петрова", "Иванова", "Козлова", "Папаева", "Жихарева",
                "Зайцева", "Парусова", "Сосницкая", "Богачева"};
        String[] fMidName = {"Геннадьевна", "Игорьевна", "Вячеславовна", "Георгиевна", "Васильевна", "Магомедовна", "Антоновна", "Александровна", "Юрьевна", "Петровна", "Михаиловна"};

        fio[0] = fLastName[rnd.nextInt(fLastName.length)];
        fio[1] = fFirstName[rnd.nextInt(fFirstName.length)];
        fio[2] = fMidName[rnd.nextInt(fMidName.length)];

        return fio;
    }

    public static String[] generateStrangeWordCombinationPlural() {
        String[] combination = new String[3];
        Random rnd = new Random();

        String[] adjectives = {"Грязные", "Нежные", "Странные", "Унылые", "Сильные", "Горячие", "Холодные", "Маленькие", "Битые", "Воздушные",
                "Унылые", "Звонкие", "Крайние", "Громкие", "Страстные", "Весёлые", "Грустные", "Топовые", "Сложные", "Простые",
                "Манёвренные", "Быстрые", "Никакие", "Тормозные", "Круглые", "Воспитанные", "Старые", "Любимые"};
        String[] nouns = {"Котлы", "Шпалы", "Пульты", "Халаты", "Ветрянки", "Бутылки", "Картины", "Машины",
                "Салфетки", "Орехи", "Острова", "Мышки", "Дятлы", "Романы", "Колёса", "Вафли", "Квадраты", "Ортопеды",
                "Зевки", "Крайности", "Звонки", "Корки", "Магазины", "Варвары", "Комплименты", "Задачи"};

        combination[0] = adjectives[rnd.nextInt(adjectives.length)];
        combination[1] = nouns[rnd.nextInt(nouns.length)];
        //fio[2] = fMidName[rnd.nextInt(fMidName.length)];

        return combination;
    }

    public static String generateLogin() {
        Random rnd = new Random();

        String[] logins = {"Yanickya", "Azannon", "Yamieko", "Imae", "Yrillavi", "Janual", "Delemo",
                "Ghann", "Onellora", "Kentu", "Hitfiel", "Dele", "Lade", "Parki", "Xesara", "Ushamun", "Xter", "Xarl", "Quill", "Dieg"};


        return logins[rnd.nextInt(logins.length)];
    }
}
