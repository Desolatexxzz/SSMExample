package com.zhouyue.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhouyue.pojo.InvictusGaming;
import com.zhouyue.service.InvictusGamingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlayerController {
    @Autowired
    @Qualifier("InvictusGamingServiceImpl")
    private InvictusGamingServiceImpl invictusGamingService;
    @RequestMapping(value = "/allPlayer")
    @ResponseBody
    public String allPlayer(Model model) throws JsonProcessingException {
        List<InvictusGaming> allPlayers = invictusGamingService.selectAll();
        System.out.println(allPlayers);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(allPlayers);
        System.out.println(s);
        return s;
    }
    @RequestMapping("/addOne")
    public String addPlayer(InvictusGaming player){
        System.out.println(player);
        invictusGamingService.addPlayer(player);
        System.out.println("添加选手");
        return "allPlayer";
    }
    @RequestMapping("/updateOne")
    public String updatePlayer(InvictusGaming player){
        invictusGamingService.updatePlayer(player);
        return "allPlayer";
    }
    @RequestMapping("/selectOne")
    @ResponseBody
    public InvictusGaming selectPlayer(int selectID){
        InvictusGaming player = invictusGamingService.selectPlayer(selectID);
        return player;
    }
    @RequestMapping("/deleteOne")
    public String deleteOne(int deleteID){
        invictusGamingService.removePlayer(deleteID);
        return "allPlayer";
    }
}
