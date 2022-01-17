package com.chinasofti.training.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author august
 * @email 379249906@qq.com
 * @date 2021-10-26 13:19:23
 */
@Data
@TableName("speaker")
public class SpeakerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String sessions;
	/**
	 * 
	 */
	private String sessionscodes;
	/**
	 * 
	 */
	private String tracks;
	/**
	 * 
	 */
	private Integer v;
	/**
	 * 
	 */
	private String bio;
	/**
	 * 
	 */
	private String company;
	/**
	 * 
	 */
	private String first;
	/**
	 * 
	 */
	private String hidden;
	/**
	 * 
	 */
	private String inshow;
	/**
	 * 
	 */
	private String last;
	/**
	 * 
	 */
	private String photo;
	/**
	 * 
	 */
	private Integer speakerid;
	/**
	 * 
	 */
	private String title;

}
