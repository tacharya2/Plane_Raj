/**
 * $Header$
 * $Log$
 * 
 * Copyright 2017 n-Bricks Inc. All rights reserved.
 * n-Bricks Inc PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.nbricks.seat.configuration.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeatController {

	@Autowired
	private SeatService service;

	@RequestMapping(method=RequestMethod.GET, value="/seats", produces={"application/xml"})
	public Seat getSeat() {
		return service.newSeat();
	}

	@RequestMapping(method=RequestMethod.GET, value="/economyseats", produces={"application/json"})
	public Seat[] findEconomySeats() {
		return service.findEconomySeats();
	}
}
