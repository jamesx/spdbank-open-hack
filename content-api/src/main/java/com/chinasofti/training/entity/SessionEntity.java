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
@TableName("session")
public class SessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private String speakernames;
	/**
	 * 
	 */
	private String speakers;
	/**
	 * 
	 */
	private String tracknames;
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
	private String myAbstract;
	/**
	 * 
	 */
	private String date;
	/**
	 * 
	 */
	private Date endtime;
	/**
	 * 
	 */
	private String eventname;
	/**
	 * 
	 */
	private String hidden;
	/**
	 * 
	 */
	private Integer roomid;
	/**
	 * 
	 */
	private String roomname;
	/**
	 * 
	 */
	private Integer sessionid;
	/**
	 * 
	 */
	private String sessioncode;
	/**
	 * 
	 */
	private Date starttime;
	/**
	 * 
	 */
	private Integer timeslot;
	/**
	 * 
	 */
	private String title;

}
