package enums;

import consts.ConditionType;
import consts.CustomerType;

public enum ConditionTypeEnum {
    NEW("New", ConditionType.NEW), USED("Used", ConditionType.USED), REFURBISHMENT("Refurbishment", ConditionType.REFURBISHMENT),
    LIKE_NEW("Like New", ConditionType.LIKE_NEW), VERY_GOOD("Very Good",ConditionType.VERY_GOOD),
    GOOD("Good",ConditionType.GOOD),ACCEPTABLE("Acceptable",ConditionType.ACCEPTABLE),
    NOT_WORKING("For parts or not working", ConditionType.NOT_WORKING),
    REPAIR("Repair",ConditionType.REPAIR),UNSPECIFIED("Unspecified",ConditionType.UNSPECIFIED);

    private final String name;
    private final String value;

    ConditionTypeEnum(final String name, final String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ConditionTypeEnum{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
