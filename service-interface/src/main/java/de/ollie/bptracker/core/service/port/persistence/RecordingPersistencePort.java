package de.ollie.bptracker.core.service.port.persistence;

import de.ollie.bptracker.core.service.model.Recording;
import de.ollie.bptracker.core.service.model.RecordingState;
import java.time.LocalDate;
import java.time.LocalTime;

public interface RecordingPersistencePort {
	Recording create(
		int sysMmHg,
		int diaMmHg,
		int pulsePerMinute,
		RecordingState state,
		LocalDate dateOfRecording,
		LocalTime timeOfRecording,
		String comment,
		String medication
	);
}
