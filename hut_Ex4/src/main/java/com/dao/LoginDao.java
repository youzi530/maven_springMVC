package com.dao;

import com.domain.Infomation;
import com.domain.Login;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    /**
     * 查询用户
     */

    @Select("select * from user where name=#{name} and password=#{password}")
    public Login findByNameAndPassword(Login user);

    /**
     * 用户及其文件信息插入数据库
     * @param infomation
     */
    @Insert("insert into info(id,filename,path) values(#{id},#{fileName},#{path})")
    void saveInfo(Infomation infomation);
}
