package com.yly.crm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yly.crm.const_enum.BizType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商机管理表，管理商机报备，内外报备，提醒跟进等
 * @TableName bizs
 */
@TableName(value ="bizs")
@Data
public class BizsDO implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商机、线索
     */
    @TableField(value = "biz_type")
    private BizType bizType;

    /**
     * 来源（渠道、官网、活动、其他）
     */
    @TableField(value = "biz_resources")
    private Object bizResources;

    /**
     * 最终报备客户名称
     */
    @TableField(value = "biz_ent_name")
    private String bizEntName;

    /**
     * 客户商机描述, 根据这个配备资源
     */
    @TableField(value = "biz_desc")
    private String bizDesc;

    /**
     * 商机阶段，消息提醒判断
     */
    @TableField(value = "biz_stage")
    private String bizStage;

    /**
     * 产品{id:name,id:name}
     */
    @TableField(value = "products")
    private Object products;

    /**
     * 预计成交金额
     */
    @TableField(value = "biz_count")
    private Integer bizCount;

    /**
     * 预计成交时间
     */
    @TableField(value = "biz_okday")
    private Date bizOkday;

    /**
     * 对口业务经理
     */
    @TableField(value = "employee_id")
    private Integer employeeId;

    /**
     * 业务经理姓名（冗余，用于查询）
     */
    @TableField(value = "employee_name")
    private String employeeName;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}