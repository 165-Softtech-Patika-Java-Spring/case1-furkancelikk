package enums;

import java.util.HashMap;
import java.util.Map;

public enum RoomType {

    LIVINGROOM(0,"Living Room"),
    BEDROOM(1,"Bedroom"),
    KITCHEN(2,"Kitchen"),
    DININGROOM(3,"Dining Room"),
    BATHROOM(4,"Bathroom");
    private final Integer key;
    private final String value;

    RoomType(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
    public Integer getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }

    static Map<Integer, RoomType> map = new HashMap<>();

    static {
        for (RoomType st : RoomType.values()) {
            map.put(st.key, st);
        }
    }
    public static RoomType getByCode(int code) {
        return map.get(code);
    }
}
