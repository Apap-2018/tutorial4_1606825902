package com.apap.tutorial4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial4.model.FlightModel;
import com.apap.tutorial4.repository.FlightDB;

/*
 * FlightServiceImpl
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDB flightDb;

	@Override
	public void addFlight(FlightModel flight) {
		// TODO Auto-generated method stub
		flightDb.save(flight);
	}

	@Override
	public FlightModel getFlightDetailById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FlightModel> getFlightDetailByPilot(String licenseNumber) {
		// TODO Auto-generated method stub
		return flightDb.findByPilotLicenseNumber(licenseNumber);
	}
	
}
