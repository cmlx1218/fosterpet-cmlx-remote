package com.fosterpet.cmlx.remote;

import com.fosterpet.cmlx.hystrix.TestRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author cmlx
 * @Date 2019-6-21 0021 16:00
 * @Version 1.0
 */
@Primary
@FeignClient(name = "cmlx-test-provider",fallback = TestRemoteHystrix.class)
public interface TestRemote {

    @RequestMapping("/user/getUserInfo")
    public String getUserInfo(@RequestParam(value = "userName") String userName);

}
