package org.sc.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;

@TableName("user")
@Data
@EqualsAndHashCode(callSuper=false)
public class UserEntity extends BaseEntity{
	private static final long serialVersionUID = 1L;
	private String host;
	private String user;
}
