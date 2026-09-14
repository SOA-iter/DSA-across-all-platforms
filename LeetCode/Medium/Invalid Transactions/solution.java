import java.util.*;

class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        String[] names = new String[n];
        int[] times = new int[n];
        int[] amounts = new int[n];
        String[] cities = new String[n];
        for (int i = 0; i < n; i++) {
            String[] tokens = transactions[i].split(",");
            names[i] = tokens[0];
            times[i] = Integer.parseInt(tokens[1]);
            amounts[i] = Integer.parseInt(tokens[2]);
            cities[i] = tokens[3];
        }
        boolean[] isInvalid = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (amounts[i] > 1000) {
                isInvalid[i] = true;
            }
            for (int j = i + 1; j < n; j++) {
                if (names[i].equals(names[j]) && !cities[i].equals(cities[j])) {
                    if (Math.abs(times[i] - times[j]) <= 60) {
                        isInvalid[i] = true;
                        isInvalid[j] = true;
                    }
                }
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isInvalid[i]) {
                result.add(transactions[i]);
            }
        }

        return result;
    }
}