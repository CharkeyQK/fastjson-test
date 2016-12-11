package com.charkey.fastjson.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public abstract class BaseBean<
        K extends Serializable & Comparable<K>,
        E extends BaseBean<K, ?>>
        extends BaseData implements IBaseBean<K>, Comparator<E>, Serializable {

    private static final long serialVersionUID = 1L;

    public BaseBean() {
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!BaseBean.class.isAssignableFrom(object.getClass())) {
            return false;
        }
        BaseBean<K, ?> dataBean = (BaseBean<K, ?>) object;
        K id = (K) getId();

        if (id == null) {
            return false;
        }

        return id.equals(dataBean.getId());
    }

    @Override
    public int hashCode() {
        int hash = 7;

        K id = (K) getId();
        if (id == null)
            return super.hashCode();

        hash = 31 * hash + id.hashCode();

        return hash;
    }

    @Override
    public int compare(E o1, E o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null || o2 == null)
            return -1;
        return ((K) o1.getId()).compareTo((K) o2.getId());
    }


    public boolean hasChildrenOnly() {
        if (this.allPropertyValues() == null)
            return true;

        for (Map.Entry<String, Object> p : this.allPropertyValues()) {
            if (p.getKey().equals("id"))
                continue;
            if (p.getValue() == null)
                continue;
            if (Collection.class.isAssignableFrom(p.getValue().getClass()))
                continue;
            if (p.getValue() != null)
                return false;

        }
        return true;
    }
}