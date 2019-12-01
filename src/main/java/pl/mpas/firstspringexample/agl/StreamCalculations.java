package pl.mpas.firstspringexample.agl;

import pl.mpas.firstspringexample.domain.Owner;
import pl.mpas.firstspringexample.domain.Secret;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class StreamCalculations {

    public static void main(String[] args) {
        Stream<BigDecimal> stream1 = Stream.of(BigDecimal.valueOf(1000_000), BigDecimal.ONE, BigDecimal.valueOf(100));

        stream1
//                .min((o1, o2) -> o1.compareTo(o2)) // (a, b) return int: -1, 0, 1
//                .min(BigDecimal::compareTo)
                .min(Comparator.comparing(e1 -> e1))
                .ifPresent(bigDecimal -> System.out.println("min: " + bigDecimal));

//        stream1.forEach(bigDecimal -> System.out.println(bigDecimal));


        List<Owner> owners = Arrays.asList(new Owner("Felek", null), new Owner("Adrian", null));
//        Collections.sort(owners);
                Stream.of(new Owner("Felek", null), new Owner("Adrian", null))
//                .max((o1, o2) -> o1.getNick().compareTo(o2.getNick()))
                .max(Comparator.comparing(Owner::getNick));
//        stream1.map();

//        Stream.of(new Secret(5), new Secret(1))
//                .min(Comparator.comparing(secret -> secret.getNumber()))
//                .min(Comparator.comparing(Secret::getNumber))

        BigDecimal sum = Stream.of(BigDecimal.valueOf(1000_000), BigDecimal.ONE, BigDecimal.valueOf(100))
                .reduce(BigDecimal.ZERO, (acumulator, bigDecimal) -> acumulator.add(bigDecimal));
        long number = Stream.of(BigDecimal.valueOf(1000_000), BigDecimal.ONE, BigDecimal.valueOf(100))
                .count();
        // TODO: use full force of reduce
    }

    static class Acumulator {
        //
        int numberOfElem;
        int sum;
    }

//    private static void calucations(String s) {
//        Map<Character, Integer> charsOversCounter = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (charsOversCounter.containsKey(c)) {
//                charsOversCounter.get(c);
//            } else {
//                charsOversCounter.put(c, 1);
//            }
//        }
//
//        charsOversCounter.entrySet().stream()
//                .filter(characterIntegerEntry -> characterIntegerEntry.getValue() > 1)
//                .collect()
//    }
}
