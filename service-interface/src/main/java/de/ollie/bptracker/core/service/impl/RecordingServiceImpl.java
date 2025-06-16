package de.ollie.bptracker.core.service.impl;

import de.ollie.bptracker.core.service.RecordingService;
import de.ollie.bptracker.core.service.model.Recording;
import de.ollie.bptracker.core.service.model.RecordingState;
import java.time.LocalDate;
import java.time.LocalTime;

public class RecordingServiceImpl implements RecordingService {

	@Override
	public Recording create(
		int sysMmHg,
		int diaMmHg,
		int pulsePerMinute,
		RecordingState state,
		LocalDate dateOfRecording,
		LocalTime timeOfRecording
	) {
		// TODO Auto-generated method stub
		return null;
	}
}
