package de.ollie.bptracker.core.service.impl;

import de.ollie.bptracker.core.service.RecordingService;
import de.ollie.bptracker.core.service.model.Recording;
import de.ollie.bptracker.core.service.model.RecordingState;
import de.ollie.bptracker.core.service.port.persistence.RecordingPersistencePort;
import jakarta.inject.Named;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
public class RecordingServiceImpl implements RecordingService {

	private final RecordingPersistencePort recordingPersistencePort;

	@Override
	public Recording createRecording(
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
