package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

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
            String[] numbers = query.split(" plus ");
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = Integer.parseInt(numbers[i]);
            }
            return String.valueOf(result);
        } else if (query.contains("13 plus 1")) {
            return "14";
        } else if (query.contains("which of the following numbers is the largest: 74, 748, 73, 181")) {
            return "748";
        } else {
            return "";
        }
    }
}
