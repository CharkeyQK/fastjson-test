package com.charkey.fastjson.domain;

import java.io.Serializable;
import java.util.Collection;

public interface IBaseData extends IBaseGetSetter, Serializable {

    Collection loadChildren(String pName, String beanName, String selecterName);

    Object loadParent(String pName, String beanName, Long parentId);

    default void loadAllRela() {

    }
}