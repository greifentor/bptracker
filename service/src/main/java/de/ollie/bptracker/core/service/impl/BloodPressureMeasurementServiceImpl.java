package de.ollie.bptracker.core.service.impl;

import de.ollie.bptracker.core.service.BloodPressureMeasurementService;
import de.ollie.bptracker.core.service.model.BloodPressureMeasurement;
import de.ollie.bptracker.core.service.model.RecordingState;
import de.ollie.bptracker.core.service.port.persistence.BloodPressureMeasurementPersistencePort;
import jakarta.inject.Named;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
public class BloodPressureMeasurementServiceImpl implements BloodPressureMeasurementService {

	private final BloodPressureMeasurementPersistencePort recordingPersistencePort;

	@Override
	public BloodPressureMeasurement createRecording(
		int sysMmHg,
		int diaMmHg,
		int pulsePerMinute,
		RecordingState state,
		LocalDate dateOfRecording,
		LocalTime timeOfRecording
	) {
		return recordingPersistencePort.create(sysMmHg, diaMmHg, pulsePerMinute, state, dateOfRecording, timeOfRecording);
	}
}
