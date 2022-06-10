package com.atguigu.vod.Utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConstantVodUtils implements InitializingBean {
    @Value("${aliyun.oss.file.keyid}")
    private  String keyId;
    @Value("${aliyun.oss.file.keysecret}")
    private  String keysecret;

    public static String ACCESS_KEY_SECRET;
    public static String ACCESS_KEY_ID;
    @Override
    public void afterPropertiesSet() throws Exception {
        ACCESS_KEY_ID = keyId;
        ACCESS_KEY_SECRET = keysecret;
    }
}
