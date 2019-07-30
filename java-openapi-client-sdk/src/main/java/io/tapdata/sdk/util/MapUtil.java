package io.tapdata.sdk.util;

import com.sun.scenario.effect.Offset;
import org.bson.types.ObjectId;
import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapUtil {
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null)
            return null;

        Object obj = beanClass.newInstance();

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                continue;
            }

            field.setAccessible(true);
            field.set(obj, map.get(field.getName()));
        }

        return obj;
    }

    public static Map<String, Object> objectToMap(Object obj, boolean id) throws Exception {
        if (obj == null) {
            return null;
        }

        Map<String, Object> map = new HashMap<>();

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(obj);

                if (!id && name.equals("id")) {
                    name = "_id";
                    value = new ObjectId();
                }

                if (value instanceof OffsetDateTime) {
                    Date date = DateTimeUtils.toDate(((OffsetDateTime) value).toInstant());
                    value = date;
                } else if (value instanceof BigDecimal) {
                    value = ((BigDecimal) value).doubleValue();
                }
                map.put(name, value);
            }
        }

        return map;
    }

}