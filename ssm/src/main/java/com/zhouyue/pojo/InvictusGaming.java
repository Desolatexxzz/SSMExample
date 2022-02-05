package com.zhouyue.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvictusGaming {
    private int playerId;
    private String playerTeamName;
    private String playerRealName;
    private int playerAge;
    private String detail;
}
