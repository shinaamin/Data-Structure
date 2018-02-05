package com.shina.programs;

 import java.util.*;
public class Test {
   /* public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque          = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = map.size();

        for (int i = 0; i < n; i++) {
            *//* Remove old value (if necessary) *//*
            if (i < m) {
                int old = deque.remove();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.put(old, map.get(old) - 1);
                }
            }
            *//* Add new value *//*
            int num = scan.nextInt();
            deque.add(num);
            map.merge(num, 1, Integer::sum);

            max = Math.max(max, map.size());
        }

        scan.close();
        System.out.println(max);
    }*/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (deque.size() < m - 1) {
                deque.offer(num);
                hashMap.merge(num, 1, Integer::sum);
            } else {
                deque.offer(in.nextInt());


                int count = 0;
                //count = hashSet.size();
                if (count > max) {
                    max = count;
                }

                deque.pop();
            }
        }
        System.out.println(max);
    }
}