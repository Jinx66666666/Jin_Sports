package com.xxx.proj.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JinApplyIndent {
    private Integer id;

    private String gamenames;
    private String gamename;
    private String gname;
    private String applyname;

    private String grouping;

    private Date applydate;

    private String sportname;
    
    private Date begindate;
    
    private Date enddate;
    
    private String sex;

    private String paystate;

    private String idcard;

    private String teamnames;

    private String phone;

    private String grade;

    private String idcardphoto; 

    private String teamid;

    private String grouptypeid;

    private String usetel;

    private String jin;

    private String picture;
    private String jinx;
    private String cost;
    private int[] stadiumList;

}