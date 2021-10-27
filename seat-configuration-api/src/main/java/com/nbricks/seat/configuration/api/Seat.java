/**
 * $Header$
 * $Log$
 * 
 * Copyright 2017 n-Bricks Inc. All rights reserved.
 * n-Bricks Inc PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.nbricks.seat.configuration.api;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "seat")
@XmlRootElement
public class Seat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uid;

	/**
	 * This method returns Uid as String.
	 * @return String
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * This method sets Uid from the given String value.
	 * @param String
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	private String seatOrderUid;
	/**
	 * This method returns SeatOrderUid as String.
	 * @return String
	 */
	public String getSeatOrderUid() {
		return seatOrderUid;
	}

	/**
	 * This method sets SeatOrderUid from the given String value.
	 * @param String
	 */
	public void setSeatOrderUid(String seatOrderUid) {
		this.seatOrderUid = seatOrderUid;
	}

	private String seatColumnName;

	/**
	 * This method returns SeatColumnName as String.
	 * @return String
	 */
	public String getSeatColumnName() {
		return seatColumnName;
	}

	/**
	 * This method sets SeatColumnName from the given String value.
	 * @param String
	 */
	public void setSeatColumnName(String seatColumnName) {
		this.seatColumnName = seatColumnName;
	}

	private int seatRowNum;

	/**
	 * This method returns SeatRowNum as int.
	 * @return int
	 */
	public int getSeatRowNum() {
		return seatRowNum;
	}

	/**
	 * This method sets SeatRowNum from the given int value.
	 * @param int
	 */
	public void setSeatRowNum(int seatRowNum) {
		this.seatRowNum = seatRowNum;
	}

	private String seatPositionTypeCode;

	/**
	 * This method returns SeatPositionTypeCode as String.
	 * @return String
	 */
	public String getSeatPositionTypeCode() {
		return seatPositionTypeCode;
	}

	/**
	 * This method sets SeatPositionTypeCode from the given String value.
	 * @param String
	 */
	public void setSeatPositionTypeCode(String seatPositionTypeCode) {
		this.seatPositionTypeCode = seatPositionTypeCode;
	}
}