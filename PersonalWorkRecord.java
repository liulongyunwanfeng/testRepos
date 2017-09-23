package com.workrecord.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import com.eplat.annotation.EntityBean;
import com.eplat.annotation.FieldInfo;
import com.eplat.annotation.TableInfo;

/**
 * 个人台账实体类
 * @author liulongyun
 *
 */
@TableInfo(tablename="TZ_PERSONALWORKRECORD",tabledesc="个人台账信息表",logtype="default")
public class PersonalWorkRecord  extends EntityBean{
	

	  @FieldInfo(fieldid="id",name="主键ID",logflag=true,propid="id",fieldtype="BigDecimal",iskey=true)
	  private BigDecimal id;
		
	  @FieldInfo(fieldid="title",name="个人台账标题",logflag=true,propid="title",fieldtype="String")
	  private String title;
	
	  @FieldInfo(fieldid="workItem",name="台账内容",logflag=true,propid="workItem",fieldtype="String")
	  private String workItem;//varchar(500) not null comment '台账内容',
	  
	  @FieldInfo(fieldid="dealDesc",name="办理情况",logflag=true,propid="dealDesc",fieldtype="String")
	  private String dealDesc;//         varchar(300) comment '办理情况描述，完成办理，未完成，等简单描述',
	  
	  @FieldInfo(fieldid="isPush",name="是否推送到处室空间",logflag=true,propid="isPush",fieldtype="Integer")
	  private Integer isPush;// tinyint not null default 0 comment '是否推送到处室空间 。1：推送，0：推送',
	  
	  @FieldInfo(fieldid="userId",name="台账所属人",logflag=true,propid="userId",fieldtype="BigDecimal")
	  private BigDecimal userId;//              bigint comment '台账所属人',
	  
	  @FieldInfo(fieldid="userName",name="台账所属人姓名",logflag=true,propid="userName",fieldtype="String")
	  private String userName;//             varchar(128) comment '台账所属人姓名',
	  
	  @FieldInfo(fieldid="noteTime",name="台账所属日期",logflag=true,propid="noteTime",fieldtype="Date")
	  private Date noteTime; //          date not null comment '台账日期，台账属于哪天的',
	  
	  @FieldInfo(fieldid="createTime",name="台账创建时间",logflag=true,propid="createTime",fieldtype="Date")
	  private Date createTime;//           datetime not null comment '台账创建时间',
	  
	  @FieldInfo(fieldid="updateTime",name="最后更新时间",logflag=true,propid="updateTime",fieldtype="Timestamp")
	  private Timestamp updateTime;//           datetime comment '最后更新时间',
	  
	  @FieldInfo(fieldid="remark",name="备注",logflag=true,propid="remark",fieldtype="String")
	  private String remark;//               varchar(300) comment '备注',
	  
	  @FieldInfo(fieldid="publicScop",name="公开范围",logflag=true,propid="publicScop",fieldtype="Integer")
	  private Integer publicScop;//公开范围0:公开，1：单位可见，2：处室可见
	  
	  @FieldInfo(fieldid="onTimeDeptId",name="台账所属人当时所属部门ID",logflag=true,propid="onTimeDeptId",fieldtype="BigDecimal")
	  private BigDecimal onTimeDeptId;//台账所属人当时所属部门ID
	  
	  @FieldInfo(fieldid="onTimeDeptName",name="台账所属人当时所属部门名称",logflag=true,propid="onTimeDeptName",fieldtype="String")
	  private  String  onTimeDeptName;//台账所属人当时所属部门名称
	  
	  @FieldInfo(fieldid="onTimeOrgtId",name="台账所属人当时所属单位ID",logflag=true,propid="onTimeOrgtId",fieldtype="BigDecimal")
	  private BigDecimal onTimeOrgtId;//台账所属人当时所属单位ID
	  
	  @FieldInfo(fieldid="onTimeOrgtName",name="台账所属人当时所属单位名称",logflag=true,propid="onTimeOrgtName",fieldtype="String")
	  private  String  onTimeOrgtName;//台账所属人当时所属单位名称
	  
	  @FieldInfo(fieldid="isDel",name="是否标识删除",logflag=true,propid="isDel",fieldtype="Integer")
	  private Integer  isDel;//是否标识删除 0：为删除 1：删除
	  
	  @FieldInfo(fieldid="isLeaderOwn",name="是否为领导台账",logflag=true,propid="isLeaderOwn",fieldtype="Integer")
	  private Integer isLeaderOwn;//是否为领导台账 0:否  1：是

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWorkItem() {
		return workItem;
	}

	public void setWorkItem(String workItem) {
		this.workItem = workItem;
	}

	public String getDealDesc() {
		return dealDesc;
	}

	public void setDealDesc(String dealDesc) {
		this.dealDesc = dealDesc;
	}


	public Integer getIsPush() {
		return isPush;
	}

	public void setIsPush(Integer isPush) {
		this.isPush = isPush;
	}

	public BigDecimal getUserId() {
		return userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getNoteTime() {
		return noteTime;
	}

	public void setNoteTime(Date noteTime) {
		this.noteTime = noteTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getPublicScop() {
		return publicScop;
	}

	public void setPublicScop(Integer publicScop) {
		this.publicScop = publicScop;
	}

	public BigDecimal getOnTimeDeptId() {
		return onTimeDeptId;
	}

	public void setOnTimeDeptId(BigDecimal onTimeDeptId) {
		this.onTimeDeptId = onTimeDeptId;
	}

	public String getOnTimeDeptName() {
		return onTimeDeptName;
	}

	public void setOnTimeDeptName(String onTimeDeptName) {
		this.onTimeDeptName = onTimeDeptName;
	}

	public BigDecimal getOnTimeOrgtId() {
		return onTimeOrgtId;
	}

	public void setOnTimeOrgtId(BigDecimal onTimeOrgtId) {
		this.onTimeOrgtId = onTimeOrgtId;
	}

	public String getOnTimeOrgtName() {
		return onTimeOrgtName;
	}


	public void setOnTimeOrgtName(String onTimeOrgtName) {
		this.onTimeOrgtName = onTimeOrgtName;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getIsLeaderOwn() {
		return isLeaderOwn;
	}

	public void setIsLeaderOwn(Integer isLeaderOwn) {
		this.isLeaderOwn = isLeaderOwn;
	}

	
	  
	

}
