package enums;

import consts.Vat;

public enum VatEnum {
    NINETEEN("19%", Vat.NINETEEN), SEVEN("7%", Vat.SEVEN), VAT_FREE("Vat Free", Vat.VAT_FREE);

    private final String name;
    private final String value;

    VatEnum(final String name, final String value) {
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
        return "VatEnum{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
