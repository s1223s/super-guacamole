package com.archillec.bigdata.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("jx_bbs")
public class BbsEntity {
    private Long id;
    private String title;
    private Boolean type;
    private String content;
    private String publisher;
    private Date add_time;
}
