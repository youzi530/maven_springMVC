package com.service.Impl;

import com.dao.LoginDao;
import com.domain.Infomation;
import com.domain.Login;
import com.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service("loginService")
public class loginServiceImpl implements loginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public Login findByNameAndPassword(Login user) throws IOException {
        return loginDao.findByNameAndPassword(user);
    }

    @Override
    public void saveInfo(Infomation infomation) {
        loginDao.saveInfo(infomation);
    }
}
