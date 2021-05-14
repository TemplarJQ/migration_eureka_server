package com.config;

/**
   @author ljq，注：客户端服务端的调用接口常量（即手动配置中心，可以替换为Apollo或Spring Clouds原生组件）
 */
public class RpcApiConfig {

    //节点前缀
    public static final String PREFIX = "http://";

    //节点A的测试接口API
    public static final String NODE_A_TEST_HELLO_API = "/test/hello";
    public static final String NODE_A_TEST_DISCOVERYCLIENT_API = "/test/discoveryClient";

    public static String getRpcService(String nodeName, String service) {
        return PREFIX + nodeName + service;
    }

}
