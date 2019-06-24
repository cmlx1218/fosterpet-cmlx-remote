package com.fosterpet.cmlx.hystrix;

import com.fosterpet.cmlx.remote.TestRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author cmlx
 * @Date 2019-6-21 0021 17:33
 * @Version 1.0
 */
@Component
public class TestRemoteHystrix implements TestRemote {

    @Override
    public String getUserInfo(@RequestParam(value = "userName") String userName)    {
        return "获取" + userName + "用户信息失败";
    }
}
