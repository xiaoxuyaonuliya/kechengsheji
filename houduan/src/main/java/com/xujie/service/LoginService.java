package com.xujie.service;

import com.xujie.utils.LoginDTO;
import com.xujie.utils.Result;

public interface LoginService {
    public Result login(LoginDTO loginDTO);
}