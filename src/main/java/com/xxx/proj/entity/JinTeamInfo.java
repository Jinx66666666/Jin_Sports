package com.xxx.proj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JinTeamInfo {
    private Integer id;
    
    private String gamename;

    private String groupname;
    private String gname;
    private String teamname;

    private String leadname;

    private String leadtel;

    private String groupid;

    private String gameinformationid;

    private String jin;
    /*private String gameList;*/
    private int[] gameList;
}