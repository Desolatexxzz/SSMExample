package com.zhouyue.service;

import com.zhouyue.pojo.InvictusGaming;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvictusGamingService {
    //添加一个队员
    int addPlayer(InvictusGaming player);
    //删除一个队员
    int removePlayer(int playerId);
    //修改队员信息
    int updatePlayer(InvictusGaming player);
    //查询一个队员信息
    InvictusGaming selectPlayer(int playerId);
    //查询全部队员信息
    List<InvictusGaming> selectAll();
}
