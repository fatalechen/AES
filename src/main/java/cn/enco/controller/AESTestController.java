package cn.enco.controller;

import cn.enco.domain.LoginInfo;
import cn.enco.utils.AesCrypt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:cgz
 * @Description:
 * @Date: create in 14:55 2019/1/13
 * @Version:
 * @Modified by:
 */
@RestController
@Slf4j
public class AESTestController {
    AesCrypt aesCrypt;
    @RequestMapping("/testAES")
    public  Object testAES(@RequestBody LoginInfo loginInfo) throws Exception {
        String resp = aesCrypt.aesDecrypt(loginInfo.getMessage());
        log.info(resp);
        return loginInfo;
    }
}
