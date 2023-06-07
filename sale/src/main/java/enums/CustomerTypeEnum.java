package enums;

import consts.CustomerType;

public enum CustomerTypeEnum {
    UNKNOWN("Unknown", CustomerType.UNKNOWN), PRIVATE("Private customer", CustomerType.PRIVATE), BUSINESS("Business customer", CustomerType.BUSINESS);

    private final String name;
    private final String value;

    CustomerTypeEnum(final String name, final String value) {
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
        return "CustomerTypeEnum{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
