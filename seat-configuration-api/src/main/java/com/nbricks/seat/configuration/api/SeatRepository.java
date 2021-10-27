/**
 * $Header$
 * $Log$
 * 
 * Copyright 2017 n-Bricks Inc. All rights reserved.
 * n-Bricks Inc PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.nbricks.seat.configuration.api;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, String> {
}
