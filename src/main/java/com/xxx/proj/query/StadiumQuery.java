package com.xxx.proj.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class StadiumQuery extends BaseQuery{
 private String stadiumname;
 private String address;
}
