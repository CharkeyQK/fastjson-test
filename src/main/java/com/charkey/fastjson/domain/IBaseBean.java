package com.charkey.fastjson.domain;

import java.io.Serializable;

public interface IBaseBean<K extends Serializable & Comparable<K>> extends IBaseData {

    final static String S_ID = "id";

    default K getId() {
        return (K) get(S_ID);
    }

    default void setId(K id) {
        set(S_ID, id);
    }

}