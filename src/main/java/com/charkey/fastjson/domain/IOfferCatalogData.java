package com.charkey.fastjson.domain;

public interface IOfferCatalogData extends IBaseData {

    final static String S_UP_CATALOG_ID = "upCatalogId";
    final static String S_CODE = "code";
    final static String S_NAME = "name";


    default Long getUpCatalogId() {
        return (Long) get(S_UP_CATALOG_ID);
    }

    default void setUpCatalogId(Long upCatalogId) {
        set(S_UP_CATALOG_ID, upCatalogId);
    }

    default String getCode() {
        return (String) get(S_CODE);
    }

    default void setCode(String code) {
        set(S_CODE, code);
    }

    default String getName() {
        return (String) get(S_NAME);
    }

    default void setName(String name) {
        set(S_NAME, name);
    }

}