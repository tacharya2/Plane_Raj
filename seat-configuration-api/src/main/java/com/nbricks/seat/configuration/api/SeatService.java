/**
 * $Header$
 * $Log$
 * 
 * Copyright 2017 n-Bricks Inc. All rights reserved.
 * n-Bricks Inc PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.nbricks.seat.configuration.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {

	@Autowired
	private SeatRepository repository;

	public Seat newSeat() {
		Seat seat = new Seat();
		seat.setUid(java.util.UUID.randomUUID().toString());
		seat.setSeatRowNum(1);
		seat.setSeatColumnName("1A");
		seat.setSeatOrderUid("O1");
		seat.setSeatPositionTypeCode("AISLE");
		return seat;
	}

	public Seat save(Seat seat) {
		return repository.save(seat);
	}

	public Seat findAll() {
		return repository.findAll();
	}

	/* My own implementation--LOL */

	public Seat[] findEconomySeats() {
		Seat []economySeats = new Seat[]
		if(repository.getSeatRowNum > 10 && repository.getSeatRowNum() < 20){
			economySeats.add(newSeat());
		}
		return economySeats;
	}

	public Seat[] findMaincabinSeats() {
		Seat []maincabinSeats = new Seat[]
		if(repository.getSeatRowNum < 10){
			economySeats.add(newSeat());
		}
		return maincabinSeats;
	}
}
// E:/Moved Desktop/Pyramid/Plane/