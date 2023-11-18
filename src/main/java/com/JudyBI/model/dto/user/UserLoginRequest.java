package com.JudyBI.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户登录请求
 * @author  Judy  "https://github.com/JudyOne1"
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}
