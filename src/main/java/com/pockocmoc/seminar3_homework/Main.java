package com.pockocmoc.seminar3_homework;
public class Main {
    public static void main(String[] args) {

        TwoWayList<Integer> twoWayList = new TwoWayList<>();
        twoWayList.add(55);
        twoWayList.add(26);
        twoWayList.add(13);
        twoWayList.add(98);

        System.out.println("Исходный список");

        for (int i = 0; i < twoWayList.size(); i++) {
            System.out.println(twoWayList.get(i));
        }
        twoWayList.reverse();

        System.out.println();
        System.out.println("Развернутый список");


        for (int j = 0; j < twoWayList.size(); j++) {
            System.out.println(twoWayList.get(j));

        }
    }
}
