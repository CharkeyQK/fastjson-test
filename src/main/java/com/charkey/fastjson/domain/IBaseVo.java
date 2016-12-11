package com.charkey.fastjson.domain;

import java.io.Serializable;

public interface IBaseVo<K extends Serializable & Comparable<K>> extends IBaseBean<K> {

    public enum OpType{
        Create
    }
    final static String S_OP_TYPE =  "opType";

    default void setOpType(OpType opType){
        this.set(S_OP_TYPE,opType);
    }

    default OpType getOpType(){
        return (OpType) this.get(S_OP_TYPE);
    }

}
