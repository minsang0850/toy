package minsang.toy.effectivejava.chapter6.item34;

import static minsang.toy.effectivejava.chapter6.item34.PayrollDay.PayType.WEEKDAY;
import static minsang.toy.effectivejava.chapter6.item34.PayrollDay.PayType.WEEKEND;

public enum PayrollDay {
    MONDAY(WEEKDAY),
    TUESDAT(WEEKDAY),
    WEDNESDAY(WEEKDAY),
    THURSDAY(WEEKDAY),
    FRIDAY(WEEKDAY),
    SATURDAY(WEEKEND),
    SUNDAY(WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType){
        this.payType = payType;
    }

    enum PayType{
        WEEKDAY,
        WEEKEND;
    }
}
