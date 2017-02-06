package com.bxl.bpm.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 应用系统
 */
public class Application {
    private Integer id;

    /**
     * 应用系统名称
     */
    @NotEmpty
    private String name;

    /**
     * 应用系统代码
     */
    @NotEmpty
    private String code;

    /**
     * 系统图标
     */
    private String iconCls;

    /**
     * 图标地址
     */
    private String iconUrl;

    /**
     * 排序
     */
    @NotNull
    private Integer sort;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者Id
     */
    @NotNull
    private Integer createrId;

    /**
     * 创建时间
     */
    @NotNull
    private Date createTime;

    /**
     * 修改者Id
     */
    @NotNull
    private Integer modifierId;

    /**
     * 修改时间
     */
    @NotNull
    private Date modifiedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls == null ? null : iconCls.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort == null ? 99 : sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime == null ? new Timestamp(System.currentTimeMillis()) : createTime;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime == null ? new Timestamp(System.currentTimeMillis()) : modifiedTime;
    }

    public static final class Builder {
        private Integer id;
        private String name;
        private String code;
        private String iconCls;
        private String iconUrl;
        private Integer sort;
        private String remark;
        private Integer createrId;
        private Date createTime;
        private Integer modifierId;
        private Date modifiedTime;

        private Builder() {
        }

        public static Builder anApplication() {
            return new Builder();
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder iconCls(String iconCls) {
            this.iconCls = iconCls;
            return this;
        }

        public Builder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public Builder sort(Integer sort) {
            this.sort = sort;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder createrId(Integer createrId) {
            this.createrId = createrId;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder modifierId(Integer modifierId) {
            this.modifierId = modifierId;
            return this;
        }

        public Builder modifiedTime(Date modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        public Application build() {
            Application application = new Application();
            application.setId(id);
            application.setName(name);
            application.setCode(code);
            application.setIconCls(iconCls);
            application.setIconUrl(iconUrl);
            application.setSort(sort);
            application.setRemark(remark);
            application.setCreaterId(createrId);
            application.setCreateTime(createTime);
            application.setModifierId(modifierId);
            application.setModifiedTime(modifiedTime);
            return application;
        }
    }
}