package com.hjj.springbootdemo.dao;

import com.hjj.springbootdemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

//继承自 JpaRepository 的接口就能完成数据访问,其中包含了几本的单表查询的方法，非常的方便。值得注意的是,
// 这个Account 对象名，而不是具体的表名，另外Interger是主键的类型，一般为Integer或者Long
public interface AccountDao extends JpaRepository<Account, Integer> {
}
