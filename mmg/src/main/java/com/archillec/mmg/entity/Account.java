package com.archillec.mmg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author Archillec
 * @since 2023-01-24
 */
@TableName("jx_account")
@ApiModel(value = "Account对象", description = "")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String openid;

    private String unionid;

    private String avatarUrl;

    private String nickName;

    @ApiModelProperty("与微信绑定的手机号")
    private String phone;

    @ApiModelProperty("性别 0：未知、1：男、2：女")
    private Boolean gender;

    @ApiModelProperty("收货地址")
    private String address;

    @ApiModelProperty("个人简介")
    private String profile;

    private String lastip;

    private Integer lasttime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    public Integer getLasttime() {
        return lasttime;
    }

    public void setLasttime(Integer lasttime) {
        this.lasttime = lasttime;
    }

    @Override
    public String toString() {
        return "Account{" +
            "id = " + id +
            ", openid = " + openid +
            ", unionid = " + unionid +
            ", avatarUrl = " + avatarUrl +
            ", nickName = " + nickName +
            ", phone = " + phone +
            ", gender = " + gender +
            ", address = " + address +
            ", profile = " + profile +
            ", lastip = " + lastip +
            ", lasttime = " + lasttime +
        "}";
    }
}
