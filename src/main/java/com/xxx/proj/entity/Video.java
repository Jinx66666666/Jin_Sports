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
public class Video {
    private Integer id;

    private String videotitle;

    private String videointroduce;

    private String video;

    private String videopicture;

    private String showtime;

    private Date begintime;

    private Date endtime;

    private String showstate;

    private String videopath;

    private String jinvideo;

}