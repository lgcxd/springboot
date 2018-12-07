package com.cbb;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @ClassName User
 * @Author: ChenBJ
 * @Description: 用户实体类
 * @Date: 2018/11/29 15:06
 * @Version:
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    @JSONField(format="yyyy-mm-dd hh:mm:ss")
    private Date createTime;
    // 若不想返回remarks? serialize:是否需要序列化属性
    @JSONField(serialize = false)
    private String remarks;
}
