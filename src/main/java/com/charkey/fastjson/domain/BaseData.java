package com.charkey.fastjson.domain;

import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.*;

public class BaseData implements IBaseData, Serializable {

    protected Map<String, Object> data = new HashMap<>();

    private final static String S_DATA = "data";

    protected Set<Map.Entry<String, Object>> allPropertyValues() {
        if (data == null) return null;
        return data.entrySet();
    }

    @Override
    public Object get(String name) {
        if (data == null) return null;
        if (S_DATA.compareToIgnoreCase(name) == 0) return data;
        Object value = data.get(name);

        if (value != null && String.class.isAssignableFrom(value.getClass())) {
            return StringUtils.isEmpty((String) value) ? null : value;
        }
        return value;
    }

    @Override
    public void set(String name, Object value) {
        if (data == null) data = new HashMap<String, Object>();
        if (S_DATA.compareToIgnoreCase(name) == 0)
            data = (Map) value;
        else
            data.put(name, value);
    }

    @Override
    public Object loadParent(String pName, String beanName, Long parentId) {
        return this.get(pName);
    }

    @Override
    public Collection loadChildren(String pName, String beanName, String selecterName) {
        if ((Collection) this.get(pName) == null) {
            this.set(pName, new ArrayList<>());
        }
        return (Collection) this.get(pName);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("entity:");
        builder.append(this.getClass().getSimpleName());
        builder.append("[");
        if (data != null) {
            for (Map.Entry<String, Object> en : data.entrySet()) {
                if (en.getKey() == null || en.getValue() == null) continue;
                builder.append(en.getKey());
                builder.append(":");
                builder.append(en.getValue());
                builder.append("; ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
