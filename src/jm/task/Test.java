package jm.task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Test {
    public static void main(String[] args) {
        Arrays.stream(new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .collect(Collectors.joining())
                .split("[\\p{Punct}\\s]+"))
                            .map(String::trim)
                            .map(String::toLowerCase)
                            .collect(HashMap::new, (m, s) ->
                                    m.put(s, m.containsKey(s) ? ((int) m.get(s) + 1) : 1), HashMap::putAll)
                            .entrySet()
                            .stream()
                            .sorted(Map.Entry.comparingByValue((c1, c2) -> ((int) c2) - ((int) c1))
                                    .thenComparing(Map.Entry.comparingByKey((s1, s2) -> s1.toString().compareTo(s2.toString()))))
                            .limit(10)
                            .forEach((k) -> System.out.println(k.getKey()));
    }
}
