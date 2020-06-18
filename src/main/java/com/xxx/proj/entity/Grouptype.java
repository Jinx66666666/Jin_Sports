package com.xxx.proj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Grouptype {
    private Integer id;

    private String gname;

    private Integer minpeople;

    private Integer maxpeople;

    private String cost;

    private String specialexplain;

    private Integer whethergroup;

    private Integer whetherpay;

    private String xxx;

   
}