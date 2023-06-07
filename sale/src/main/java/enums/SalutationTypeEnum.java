package enums;

import consts.CustomerType;
import consts.SalutationType;

public enum SalutationTypeEnum {
    MR("Mr.", SalutationType.MR), MRS("Mrs", SalutationType.MRS), FAMILY("Family", SalutationType.FAMILY), COMPANY("Company",SalutationType.COMPANY);

    private final String name;
    private final String value;

    SalutationTypeEnum(final String name, final String value) {
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
        return "SalutationTypeEnum{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
