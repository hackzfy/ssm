package com.zfy.dao;

import com.zfy.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface AccountDao {


    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account (name, money) values (#{name}, #{money})")
    void saveAccount(Account account);

    @Select("select * from account where name = #{name}")
    Account findAccountByName(String name);

    @Update("update account set name=#{name}, money=#{money} where id=#{id}")
    void updateAccount(Account account);

}
