package egor.oop;

import java.util.ArrayList;
import java.util.List;
import  static egor.oop.Cat.numberOfCats;
import static egor.oop.Mammal.isLovePossible;

public class CatMain {
    public static void main(String[] args) {

        Cat papa = new Cat("Барсик", 2015, LifeStage.OLD, TailLength.SHORT, WoolLength.SHORTHAIRED,
                Sex.MALE, "Японский бобтейл", "белый", false, false, false, false,
                true, true, true, true, false);
        Cat mama = new Cat("Матильда", 2020, LifeStage.YOUNG, TailLength.LONG, WoolLength.LONGHAIRED,
                Sex.FEMALE, "Мейн-кун", "серый", true, true, true, true,
                false, false, false, false, true);
        Cat streetCat = new Cat("Мурзик", 2010, LifeStage.OLD, TailLength.LONG, WoolLength.CURLYHAIRED,
                Sex.MALE, "Персидская", "рыжий", true, true, true, true,
                true, true, true, true, true);
        Cat neighborCat = new Cat("Элоиза", 2021, LifeStage.YOUNG, TailLength.LONG, WoolLength.LONGHAIRED,
                Sex.FEMALE, "Сибирская", "серый", false, false, false, false,
                false, false, false, false, false);
        Cat grandpa = new Cat("Рыжик", 2018, LifeStage.ADULT, TailLength.LONG, WoolLength.SHORTHAIRED,
                Sex.MALE, "Абиссинская", "рыжий", false, true, false, true,
                false, true, false, true, false);
        Cat granny = new Cat("Мурка", 2012, LifeStage.OLD, TailLength.SHORT, WoolLength.NAKED,
                Sex.FEMALE, "Сфинкс", "белый", true, false, true, false,
                true, false, true, false, true);
        Cat abandonedCat = new Cat("Кыся", 2018, LifeStage.ADULT, TailLength.LONG, WoolLength.SEMILONGHAIRED,
                Sex.FEMALE, "Азиатская", "бурый", false, false, false, true,
                true, true, false, false, false);
        Cat magicCat = new Cat("Снежок", 2019, LifeStage.ADULT, TailLength.LONG, WoolLength.SHORTHAIRED,
                Sex.MALE, "Турецкий ван", "белый", true, true, true, false,
                false, false, true, true, true);
        Cat ghostCat = new Cat("Уксус", 2022, LifeStage.YOUNG, TailLength.LONG, WoolLength.SEMILONGHAIRED,
                Sex.MALE, "Тонкинская", "чёрный", false, false, true, true,
                false, false, true, true, false);
        Cat rescueCat = new Cat("Сакура", 2017, LifeStage.ADULT, TailLength.LONG, WoolLength.LONGHAIRED,
                Sex.FEMALE, "Сомалийская", "рыжий", true, true, false, false,
                true, true, false, false, true);
        Cat shelterCat = new Cat("Изюмчик", 2015, LifeStage.OLD, TailLength.SHORT, WoolLength.LONGHAIRED,
                Sex.MALE, "Шантильи-Тиффани", "серо-белый", false, true, true, false,
                true, true, false, true, true);
        Cat monasteryCat = new Cat("Рафаэль", 2018, LifeStage.ADULT, TailLength.LONG, WoolLength.SEMILONGHAIRED,
                Sex.MALE, "Сингапура", "серый", true, false, false, true,
                false, false, true, false, false);
        Cat fatCat = new Cat("Нефертити", 2020, LifeStage.YOUNG, TailLength.SHORT, WoolLength.SEMILONGHAIRED,
                Sex.FEMALE, "Сноу-Шу", "чёрно-белый", true, false, true, true,
                false, false, true, true, true);
        Cat madCat = new Cat("Кардинал", 2016, LifeStage.ADULT, TailLength.LONG, WoolLength.SHORTHAIRED,
                Sex.MALE, "Сиамская", "чёрно-белый", false, true, false, false,
                true, true, false, false, false);
        Cat singleCat = new Cat("Шелли", 2022, LifeStage.YOUNG, TailLength.LONG, WoolLength.CURLYHAIRED,
                Sex.FEMALE, "Селкирк-Рекс", "белый", false, true, true, true,
                false, true, true, true, false);
        Cat richCat = new Cat("Имбирь", 2017, LifeStage.ADULT, TailLength.SHORT, WoolLength.SEMILONGHAIRED,
                Sex.MALE, "Шотландская вислоухая", "рыже-белый", true, false, false, false,
                true, false, false, false, true);
        Cat earlessCat = new Cat("Физалис", 2016, LifeStage.ADULT, TailLength.LONG, WoolLength.SHORTHAIRED,
                Sex.MALE, "Саванна", "рыжий", false, true, true, false,
                false, true, true, false, false);
        Cat showCat = new Cat("Юсси", 2013, LifeStage.OLD, TailLength.LONG, WoolLength.SEMILONGHAIRED,
                Sex.FEMALE, "Русская голубая", "серый", true, false, false, true,
                true, false, false, true, true);
        Cat hornyCat = new Cat("Казанова", 2019, LifeStage.ADULT, TailLength.LONG, WoolLength.LONGHAIRED,
                Sex.MALE, "Рэгдолл", "белый", true, true, true, false,
                true, true, true, false, true);
        Cat starCat = new Cat("Бэмби", 2021, LifeStage.YOUNG, TailLength.SHORT, WoolLength.NAKED,
                Sex.FEMALE, "Украинский левкой", "розовый", false, false, false,
                false, true, true, true, true, false);



//        Cat baby = papa.makeLoveWith(mama);
//        System.out.println(baby.toString());


        List<Cat> myCats = new ArrayList<>();
        myCats.add(mama);
        myCats.add(papa);
        myCats.add(showCat);
        myCats.add(singleCat);
        myCats.add(shelterCat);
        myCats.add(starCat);
        myCats.add(streetCat);
        myCats.add(hornyCat);
        myCats.add(ghostCat);
        myCats.add(neighborCat);
        myCats.add(richCat);
        myCats.add(rescueCat);
        myCats.add(grandpa);
        myCats.add(granny);
        myCats.add(madCat);
        myCats.add(magicCat);
        myCats.add(monasteryCat);
        myCats.add(fatCat);
        myCats.add(earlessCat);
        myCats.add(abandonedCat);

        int countPlayful = 0;
        int countShy = 0;
        int countGentle = 0;
        int countKind = 0;
        int countNaughty = 0;
        int countClosed = 0;
        int countAggressive = 0;
        int countSmart = 0;
        int countLazy = 0;

        for (int j = 0; j < myCats.size() && myCats.size() <= 100000; j++) {
            Cat someCat = myCats.get(j);
            for (int k = 0; k < myCats.size(); k++) {
                Cat someAnotherCat = myCats.get(k);
                boolean canMakeLove = Mammal.isLovePossible(someCat, someAnotherCat);
                if (canMakeLove) {
                    Cat child = someCat.makeLoveWith(someAnotherCat);
                    if (child != null) {
                        child.setLifeStage(LifeStage.ADULT);
                        myCats.add(child);
//                        System.out.println(child);

                        if (child.isPlayful()) {
                            countPlayful++;
                        }
                        if (child.isShy()) {
                            countShy++;
                        }
                        if (child.isGentle()) {
                            countGentle++;
                        }
                        if (child.isKind()) {
                            countKind++;
                        }
                        if (child.isNaughty()) {
                            countNaughty++;
                        }
                        if (child.isClosed()) {
                            countClosed++;
                        }
                        if (child.isAggressive()) {
                            countAggressive++;
                        }
                        if (child.isSmart()) {
                            countSmart++;
                        }
                        if (child.isLazy()) {
                            countLazy++;
                        }


                    }

                }
            }

        }
        System.out.println("У нас получилось " + myCats.size() + " котиков, из них \n\n Игривых: " + countPlayful);
        System.out.println("\n Застенчивых: " + countShy);
        System.out.println("\n Нежных: " + countGentle);
        System.out.println("\n Добрых: " + countKind);
        System.out.println("\n Замкнутых: " + countClosed);
        System.out.println("\n Непослушных: " + countNaughty);
        System.out.println("\n Агрессивных: " + countAggressive);
        System.out.println("\n Умных: " + countSmart);
        System.out.println("\n Ленивых: " + countLazy);
        System.out.println("Всего через статик " + numberOfCats);


    }

}

