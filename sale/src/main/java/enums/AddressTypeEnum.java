package enums;

import consts.AddressType;

public enum AddressTypeEnum {
    INVOICE("Invoice address", AddressType.INVOICE), DELIVER("Deliver address", AddressType.DELIVER);

    private final String name;
    private final String value;

    AddressTypeEnum(final String name, final String value) {
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
        return "AddressTypeEnum{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
