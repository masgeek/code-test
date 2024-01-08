package com.munywele.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class VisitCounter {


    public Map<Long, Long> count(Map<String, UserStats>... visit) {
        if (visit == null || visit.length == 0) {
            return Collections.emptyMap();
        }

        return Arrays.stream(visit)
                .filter(Objects::nonNull)
                .flatMap(map -> map.entrySet().stream())
                .filter(entry -> isValidEntry(entry.getKey(), entry.getValue()))
                .collect(Collectors.groupingBy(
                        entry -> parseLong(entry.getKey()),
                        Collectors.summingLong(entry -> entry.getValue().getVisitCount().orElse(0L))
                ));
    }

    private boolean isValidEntry(String key, UserStats userStats) {
        return key != null && parseLong(key) != null && userStats != null && userStats.getVisitCount().isPresent();
    }

    private Long parseLong(String s) {
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException | NullPointerException e) {
            return null;
        }
    }
}
