package array;

import java.util.List;

public enum MyEnum {

    MONTHDAY(1, "星期一"),

    TUESDAY(2, "星期二"),

    ;

    private int code;
    private String chinese;


    MyEnum(int code, String chinese) {
        this.code = code;
        this.chinese = chinese;
    }

    public int getCode() {
        return code;
    }

    public String getChinese() {
        return chinese;
    }

}
