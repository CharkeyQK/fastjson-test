package com.charkey.fastjson.utils;

import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

public class BaseFastjsonPropertyFilter extends SimplePropertyPreFilter {

    /*
      版本 1.2.21 依然存在这个bug
      jdk1.8下若接口的缺省方法未被重写，则fastjson反系列化可能报错：
      Java.lang.IncompatibleClassChangeError: Found interface xxx, but class was expected
      原因：实现类中未实现xxx interface的default方法，导致asm中设值的method属于接口(本应属于实现类)，调用错误。
      解决方法：禁止fastjson使用asm反系列化。
     */
    //static{
    //    ParserConfig.getGlobalInstance().setAsmEnable(false);
    //    SerializeConfig.getGlobalInstance().setAsmEnable(false);
    //}

    public BaseFastjsonPropertyFilter(String... properties) {
        super();
        for (String p : properties)
            super.getExcludes().add(p);
    }
}
