package com.zhouyue.service;

import com.zhouyue.dao.InvictusGamingMapper;
import com.zhouyue.pojo.InvictusGaming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("InvictusGamingServiceImpl")
public class InvictusGamingServiceImpl implements InvictusGamingService{
    @Autowired
    private InvictusGamingMapper invictusGamingMapper;
    public void setInvictusGamingMapper(InvictusGamingMapper invictusGamingMapper) {
        this.invictusGamingMapper = invictusGamingMapper;
    }
    @Override
    public int addPlayer(InvictusGaming player) {
        return invictusGamingMapper.addPlayer(player);
    }

    @Override
    public int removePlayer(int playerId) {
        return invictusGamingMapper.removePlayer(playerId);
    }

    @Override
    public int updatePlayer(InvictusGaming player) {
        return invictusGamingMapper.updatePlayer(player);
    }

    @Override
    public InvictusGaming selectPlayer(int playerId) {
        return invictusGamingMapper.selectPlayer(playerId);
    }

    @Override
    public List<InvictusGaming> selectAll() {
        return invictusGamingMapper.selectAll();
    }
}
