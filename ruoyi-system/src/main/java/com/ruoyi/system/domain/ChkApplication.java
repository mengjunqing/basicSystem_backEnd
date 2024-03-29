package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * application对象 chk_application
 * 
 * @author jc.men
 * @date 2024-03-04
 */
public class ChkApplication extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 作成時間 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "作成時間", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 関連業務ID */
    @Excel(name = "関連業務ID")
    private Long serviceId;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setServiceId(Long serviceId) 
    {
        this.serviceId = serviceId;
    }

    public Long getServiceId() 
    {
        return serviceId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createdTime", getCreatedTime())
            .append("userId", getUserId())
            .append("serviceId", getServiceId())
            .toString();
    }
}
