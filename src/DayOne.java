import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Solution to https://adventofcode.com/2020/day/1
 *
 * @author Kevin Nilsson
 */
public class DayOne {

    public static void main(String[] args) throws IOException {
        List<Integer> list = Files.lines(Paths.get("src/dayonenumbers.txt"))
                .map(Integer::parseInt).collect(Collectors.toList());

        final Integer SOLUTION_ONE = partOne(list);
        final Integer SOLUTION_TWO = partTwo(list);

        System.out.println(SOLUTION_ONE);
        System.out.println(SOLUTION_TWO);
    }

    private static Integer partOne(List<Integer> list) {

        for (Integer i : list) {
            for (Integer j : list) {
                if ((i + j == 2020)) {
                    return i * j;
                }
            }
        }
        return null;
    }

    private static Integer partTwo(List<Integer> list) {

        for (Integer i : list) {
            for (Integer j : list) {
                for (Integer k : list) {
                    if ((i + j + k) == 2020) {
                        return i * k * j;
                    }
                }

            }
        }
        return null;
    }
}
