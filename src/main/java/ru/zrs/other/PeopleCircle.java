package ru.zrs.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author zrs
 * Имеется список из 5 человек - "Глеб", "Серегей", "Женя", "Костя", "Наташа"
 * Необходимо написать программу выводящую схему "хоровода" составленного из этих людей. Т.е. схему замкнутой цепи.
 * <p>
 * При каждом последующем запуске программа должна выдавать другое, случайное построение цепи.
 * Примеры вывода программы:
 * <p>
 * 1 запуск:
 * Костя->Наташа->Женя->Глеб->Серегей->Костя
 * 2 запуск:
 * Глеб->Костя->Наташа->Серегей->Женя->Глеб
 * 3 запуск:
 * Серегей->Глеб->Костя->Наташа->Женя->Серегей
 */
public class PeopleCircle {

    public static void main(String[] args) {

        List<String> people = new ArrayList<>();
        people.add("Глеб");
        people.add("Сергей");
        people.add("Женя");
        people.add("Костя");
        people.add("Наташа");

        peopleCircleWithRandom(new ArrayList<>(people));
        System.out.println("*****************");
        peopleCircleWithShuffle(new ArrayList<>(people));
    }

    private static void peopleCircleWithRandom(List<String> people) {
        Random random = new Random();

        String first = people.get(0);

        StringBuilder sb = new StringBuilder();
        while (!people.isEmpty()) {
            int idx = random.nextInt(people.size());
            if (first == null) {
                first = people.get(idx);
            }
            sb.append(people.get(idx)).append("->");
            people.remove(idx);
        }
        sb.append(first);
        System.out.println(sb);
    }

    public static void peopleCircleWithShuffle(List<String> people) {
        Collections.shuffle(people);
        people.add(people.get(0));
        System.out.println(String.join("->", people));
    }
}
