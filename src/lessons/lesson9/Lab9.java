package lessons.lesson9;

import java.util.*;

public class Lab9 {
    //Задание 2
    public static Set noDuplicates(List list) {
        return new HashSet(list);
    }

    //Задание 3
    public static List oneMillionElements(String string) {
        if (string.equals("arrayList")) {
            List arrayList = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 1000000; i++) {
                arrayList.add(random.nextInt(1000));
            }
            return arrayList;
        } else if (string.equals("linkedList")) {
            List linkedList = new LinkedList();
            Random random = new Random();
            for (int i = 0; i < 1000000; i++) {
                linkedList.add(random.nextInt(1000));
            }
            return linkedList;
        } else {
            System.out.println("Неккорректный ввод");
            return new ArrayList();
        }

    }

    public static void oneThousandTime(String string) {
        List list = oneMillionElements(string);
        Random random = new Random();
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(random.nextInt(1000000));
        }
        System.out.println(System.currentTimeMillis() - time);
    }

    //Задание 4
    public static void userGamePoints(Map map) {
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        Set<User> keys = map.keySet();
        for (User user : keys) {
            if (userName.equals(user.getName())) {
                System.out.println("Пользователь: " + userName + "   Очки: " + map.get(user));
                return;
            }
        }
        System.out.println("Пользователь с таким именем не зарегистрирован");
        return;
    }
}
