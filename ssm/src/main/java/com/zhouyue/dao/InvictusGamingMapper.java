package com.zhouyue.dao;

import com.zhouyue.pojo.InvictusGaming;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface InvictusGamingMapper {
    //添加一个队员
    int addPlayer(InvictusGaming player);
    //删除一个队员
    int removePlayer(@Param("playerId") int playerId);
    //修改队员信息
    int updatePlayer(InvictusGaming player);
    //查询一个队员信息
    InvictusGaming selectPlayer(@Param("playerId") int playerId);
    //查询全部队员信息
    List<InvictusGaming> selectAll();
}
