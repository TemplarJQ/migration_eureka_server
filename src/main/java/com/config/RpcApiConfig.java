package com.config;

/**
   @author ljq，注：客户端服务端的调用接口常量（即手动配置中心，可以替换为Apollo或Spring Clouds原生组件）
 */
public class RpcApiConfig {

    //节点A的测试接口API
    public static final String NODE_A_HELLO_TEST_API = "http://edge-node-A/test/hello";
    public static final String NODE_A_DISCOVERYCLIENT_TEST_API = "http://edge-node-A/test/discoveryClient";

}
