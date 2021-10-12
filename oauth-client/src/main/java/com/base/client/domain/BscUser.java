package com.base.client.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenfuhao
 * @since 2021-09-15
 */
@Data
public class BscUser implements Serializable {


    /**
     * 主键
     */
    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 测
     */
    private String fu;

    /**
     * gg
     */
    private String ff;


}
