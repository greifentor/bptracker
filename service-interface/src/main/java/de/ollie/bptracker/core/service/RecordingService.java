package de.ollie.bptracker.core.service;

import de.ollie.bptracker.core.service.model.Recording;
import de.ollie.bptracker.core.service.model.RecordingState;
import java.time.LocalDate;
import java.time.LocalTime;

public interface RecordingService {
	Recording createRecording(
		int sysMmHg,
		int diaMmHg,
		int pulsePerMinute,
		RecordingState state,
		LocalDate dateOfRecording,
		LocalTime timeOfRecording
	);
}
