package org.mySelfBank.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mySelfBank.entity.BankUser;
import org.mySelfBank.entity.BankUserExample;

public interface BankUserMapper {
    long countByExample(BankUserExample example);

    int deleteByExample(BankUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(BankUser record);

    int insertSelective(BankUser record);

    List<BankUser> selectByExample(BankUserExample example);

    BankUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") BankUser record, @Param("example") BankUserExample example);

    int updateByExample(@Param("record") BankUser record, @Param("example") BankUserExample example);

    int updateByPrimaryKeySelective(BankUser record);

    int updateByPrimaryKey(BankUser record);
}