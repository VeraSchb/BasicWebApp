package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "V";
        } else if (query.contains("plus")) {
            String[] numbers = query.split(" ");
            int result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[2]);
            return String.valueOf(result);
        } else if (query.contains("largest")) {
            String[] numbers = query.split(":");
            String[] numbers1 = numbers[1].split(",");
            int[] numbers2 = new int[numbers1.length];
            for (int i = 0; i < numbers1.length; i++) {
                numbers2[i] = Integer.parseInt(numbers1[i]);
            }
            Arrays.sort(numbers2);
            return String.valueOf(numbers2[numbers2.length - 1]);
        } else {
            return "";
        }
    }
}
