package de.ollie.bptracker.core.service;

import de.ollie.bptracker.core.service.model.BloodPressureMeasurement;
import de.ollie.bptracker.core.service.model.RecordingState;
import java.time.LocalDate;
import java.time.LocalTime;

public interface BloodPressureMeasurementService {
	BloodPressureMeasurement createRecording(
		int sysMmHg,
		int diaMmHg,
		int pulsePerMinute,
		RecordingState state,
		LocalDate dateOfRecording,
		LocalTime timeOfRecording
	);
}
