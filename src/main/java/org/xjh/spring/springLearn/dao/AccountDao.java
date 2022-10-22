package org.xjh.spring.springLearn.dao;

import org.apache.ibatis.annotations.Insert;
import org.xjh.spring.springLearn.domain.Account;

public interface AccountDao {
    @Insert("insert into tbl_account(name,money)values(#{name},#{money})")
    void save(Account account);
}
