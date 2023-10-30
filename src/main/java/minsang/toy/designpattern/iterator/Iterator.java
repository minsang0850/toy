package minsang.toy.designpattern.iterator;

public interface Iterator {
    //수행할 항목이 있는지 여부 확인
    boolean hasNext();
    //다음 항목을 선택
    IteratorItem next();
}
