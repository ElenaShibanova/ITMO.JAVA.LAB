package lessons.lesson9;

import java.util.*;

public class TestLab9 {
    public static void main(String[] args) {
        System.out.println("----Задание 2----");
        List list1 = Arrays.asList(1, 2, 3, 3, 4, 2);
        List list2 = Arrays.asList("q", "wee", "r", "t", "wee", 4.5);
        System.out.println(Lab9.noDuplicates(list1));
        System.out.println(Lab9.noDuplicates(list2));

        System.out.println("----Задание 3----");
        Lab9.oneThousandTime("arrayList");
        Lab9.oneThousandTime("linkedList");

        System.out.println("----Задание 4----");
        User ivan = new User();
        ivan.setName("Иван");
        User vasilisa = new User();
        vasilisa.setName("Василиса");
        User agata = new User();
        agata.setName("Агата");
        User daniil = new User();
        daniil.setName("Даниил");
        User nikita = new User();
        nikita.setName("Никита");

        Map<User, Integer> gamePoints = new HashMap<>();
        gamePoints.put(ivan, 234);
        gamePoints.put(vasilisa, 135);
        gamePoints.put(agata, 4);
        gamePoints.put(daniil, 105);
        gamePoints.put(nikita, 3);

        Lab9.userGamePoints(gamePoints);
    }

}
