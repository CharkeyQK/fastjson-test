package com.charkey.fastjson.controller;

import com.charkey.fastjson.domain.BaseVoBean;
import com.charkey.fastjson.domain.MsgHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public abstract class BaseController<V extends BaseVoBean<Long, V>> {

    Logger logger = LoggerFactory.getLogger(BaseController.class);

    @RequestMapping(value = "/qry", method = RequestMethod.POST)
    @ResponseBody
    public MsgHeader<List<V>> get(@RequestBody MsgHeader<V> req) {
        MsgHeader<List<V>> msgResponse = new MsgHeader<>();
        if (req == null || req.getValue() == null)
            return msgResponse;
        // do some service operation
        logger.debug(req.getValue().getClass().getName());
        return msgResponse;
    }

    @RequestMapping(value = "/qryByProps", method = RequestMethod.POST)
    @ResponseBody
    public MsgHeader<List<V>> getByProps(@RequestBody MsgHeader<Map<String, Object>> req) {
        MsgHeader<List<V>> msgResponse = new MsgHeader<>();
        if (req == null || req.getValue() == null)
            return msgResponse;
        // do some service operation
        logger.debug(req.getValue().getClass().getName());
        return msgResponse;
    }

}
