package com.hjj.springbootdemo.dao;

import com.hjj.springbootdemo.model.Account;

import java.util.List;


public interface IAccountDAO {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
