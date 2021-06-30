package com.service;

import com.error.BusinessException;
import com.response.CommonReturnType;
import com.service.model.AdminModel;
import com.service.model.UserModel;

public interface UserIdentityService {

    void adminRegister(AdminModel adminModel) throws BusinessException;

    AdminModel adminValidateLogin(Integer adminId, String password) throws BusinessException;

    void userRegister(UserModel userModel) throws BusinessException;

    UserModel userValidateLogin(Integer userId, String password) throws BusinessException;
}
