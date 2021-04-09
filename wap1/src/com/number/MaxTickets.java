package com.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxTickets {

    public static void main(String[] args) {
        test(4,13,2,4,3);
		/*
		 * test(10,1,5,2,5,5,2,6,3,5,3); test(10,1,5,1,2,5,5,2,6,3,5,3);
		 * test(9,1,4,5,2,2,3,1,6,9,10); test(1,2,4,7,8,11,22);
		 * test(1,2,2,2,3,4,7,8,11,14,22); test(1,1,2,4,4,4,7,8,11,22);
		 */
    }

    static int maxTickets(List<Integer> tickets) {
        Collections.sort(tickets);
        tickets.forEach(num -> System.out.print(num + " "));

        List<Integer> list = new ArrayList<>();
        int len = tickets.size();
        int distance;
        int curDistance = Integer.MIN_VALUE;
        int lastDistance = Integer.MIN_VALUE;
        boolean first = true;

        for(int i = 1; i < len; i++) {
            int left = tickets.get(i-1);
            int right = tickets.get(i);
            distance = right - left;

            if(i == 1) {
                updateSum(list, 2);
            } else {
                if(lastDistance == 0 && first) {
                    updateSum(list, 1);
                }
                else if(distance == 0 ||
                    distance == curDistance) {
                    updateSum(list, 1);
                } else if(distance != curDistance) {
                    list.add(1);
                }
            }

            if(distance != 0) {
                curDistance = distance;
            }
            lastDistance = distance;
            if(i >= 2) {
                first = false;
            }
        }

        return
        list.stream()
            .max(Comparator.comparingInt(i  -> i))
            .get();

    }

    private static void updateSum(List<Integer> list, int value) {
        if(list.isEmpty()) {
            list.add(value);
        } else {
            int lastIndex = list.size() - 1;
            list.set(lastIndex, list.get(lastIndex) + value);
        }
    }

    private static void test(Integer... numbers) {
        List<Integer> list = Arrays.asList(numbers);
        int result = maxTickets(list);
        System.out.println("\n" + result);
    }

}