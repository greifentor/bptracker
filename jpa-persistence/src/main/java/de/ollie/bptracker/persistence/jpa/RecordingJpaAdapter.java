package de.ollie.bptracker.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.bptracker.core.service.model.Recording;
import de.ollie.bptracker.core.service.model.RecordingState;
import de.ollie.bptracker.core.service.port.persistence.RecordingPersistencePort;
import jakarta.inject.Named;
import java.time.LocalDate;
import java.time.LocalTime;

@Named
class RecordingJpaAdapter implements RecordingPersistencePort {

	@Override
	public Recording create(
		int sysMmHg,
		int diaMmHg,
		int pulsePerMinute,
		RecordingState state,
		LocalDate dateOfRecording,
		LocalTime timeOfRecording
	) {
		ensure(dateOfRecording != null, "Date of recording cannot be null!");
		ensure(diaMmHg > 0, "DiaMmHg cannot be lesser then 1!");
		ensure(pulsePerMinute > 0, "PulsePerMinute cannot be lesser then 1!");
		ensure(state != null, "State cannot be null!");
		ensure(sysMmHg > 0, "SysMmHg cannot be lesser then 1!");
		// TODO Auto-generated method stub
		return null;
	}
}
