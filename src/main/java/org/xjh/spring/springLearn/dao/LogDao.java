package org.xjh.spring.springLearn.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {
    @Insert("insert into tbl_log (info,creatDate) values(#{info},now())")
    void log(String info);
}
