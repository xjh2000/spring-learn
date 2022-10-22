package org.xjh.spring.springLearn.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.xjh.spring.springLearn.domain.Account;

@Repository
public interface AccountDao {
    @Insert("insert into tbl_account(name,money)values(#{name},#{money})")
    void save(Account account);

    @Update("update tbl_account set money = money + #{money} where name = #{name}")
    void inMoney(@Param("name") String name, @Param("money") Double money);

    @Update("update tbl_account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name") String name, @Param("money") Double money);
}
