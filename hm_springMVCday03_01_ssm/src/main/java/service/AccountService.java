package service;

import domain.Account;
import java.util.List;

/**
 * 业务层接口
 */
public interface AccountService {

    //查询所有
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}
