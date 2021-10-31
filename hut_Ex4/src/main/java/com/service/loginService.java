package com.service;

import com.domain.Infomation;
import com.domain.Login;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.io.IOException;

public interface loginService {

    public Login findByNameAndPassword(Login user) throws IOException;

    void saveInfo(Infomation infomation);
}
