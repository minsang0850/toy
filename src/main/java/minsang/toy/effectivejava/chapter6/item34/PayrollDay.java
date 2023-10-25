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

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }

    enum PayType {
        WEEKDAY {
            //주중에는 8시간 미만으로 일할 시 추가수당 없음.
            public int overtimePay(int minutesWorked, int payRate) {
                return minutesWorked <= MINS_PER_SHIFT ? 0 :
                        (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND{
            //주말에는 기본적으로 추가수당. (시급의 0.5배를 추가로)
            public int overtimePay(int minutesWorked, int payRate) {
                return minutesWorked * payRate / 2;
            }
        };

        abstract int overtimePay(int mins, int payRate);
        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minsWorked, int payRate) {
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }
}
