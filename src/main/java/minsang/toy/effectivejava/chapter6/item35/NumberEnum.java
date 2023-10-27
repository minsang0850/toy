package minsang.toy.effectivejava.chapter6.item35;

public enum NumberEnum {
    ONE, TWO, THREE, FOUR, FIVE;

    public int getValue() {
        return ordinal() + 1;
    }
}
