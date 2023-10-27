package minsang.toy.effectivejava.chapter6.item36;

import java.util.EnumSet;
import java.util.Set;

public class Text {
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    public void applyStyles(Set<Style> styles) {
        // ...
    }

    public EnumSet<Style> allOf(){
        //Color의 모든 요소를 포함하는 EnumSet
        return EnumSet.allOf(Style.class);
    }

    public EnumSet<Style> noneOf(){
        //Color의 빈 Set
        return EnumSet.noneOf(Style.class);
    }
}

//text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));