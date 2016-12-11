package com.charkey.fastjson.domain;

import java.io.Serializable;

public class BaseVoBean<K extends Serializable & Comparable<K>, V extends BaseVoBean<K, ?>>
        extends BaseBean<K, V> implements IBaseVo<K>, Serializable {

}
