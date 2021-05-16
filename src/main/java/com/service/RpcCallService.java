package com.service;

import com.response.CommonReturnType;

import java.util.Map;

public interface RpcCallService {

    CommonReturnType sendRpcCall(String nodeName, String apiName);

    CommonReturnType sendRpcCall(String nodeName, String apiName, Map<String, String> map);
}
