package sample;

import java.util.Arrays;
import java.util.List;

public enum Category {

    LIKE("좋아요", Arrays.asList(1, 2, 3));

    private final String name;
    private final List<Integer> possibles;

    Category(final String name, final List<Integer> possibles) {
        this.name = name;
        this.possibles = possibles;
    }
}
