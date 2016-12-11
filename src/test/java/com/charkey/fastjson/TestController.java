package com.charkey.fastjson;

/**
 * Created by Charkey on 11/21/2016.
 */
public class TestController {

    public static void main(String[] args) {
        // 1. 查看 TODO， 修改 web.xml 以切换配置文件
        // 2. 启动 web 工程
        // 3. post /offerCatalog/qry 内容为 {"messageid":"118029","value":{}}
        // 4. 当使用 fastjson 解析时，com/charkey/fastjson/controller/BaseController.java:17 req 参数中 value 为 JSONObject
        // 5. 当使用 jackson 解析时，com/charkey/fastjson/controller/BaseController.java:17 req 参数中 value 为 OfferCatalogVo
    }

}
