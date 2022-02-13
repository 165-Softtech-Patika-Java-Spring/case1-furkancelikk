package enums;

import java.util.HashMap;
import java.util.Map;

public enum HouseType {

    APARTMENT(0,"Apartment"),
    VILLA(1,"Villa"),
    SUMMERY(2,"Summery");
    private final Integer key;
    private final String value;

    HouseType(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
    public Integer getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }

    static Map<Integer, HouseType> map = new HashMap<>();

    static {
        for (HouseType st : HouseType.values()) {
            map.put(st.key, st);
        }
    }
    public static HouseType getByCode(int code) {
        return map.get(code);
    }
}
