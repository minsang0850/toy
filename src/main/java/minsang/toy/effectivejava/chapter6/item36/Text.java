package minsang.toy.effectivejava.chapter6.item36;

import java.util.Set;

public class Text {
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    public void applyStyles(Set<Style> styles) {
        // ...
    }
}

//text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
