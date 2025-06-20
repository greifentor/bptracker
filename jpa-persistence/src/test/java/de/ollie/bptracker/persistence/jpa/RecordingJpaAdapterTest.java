package de.ollie.bptracker.persistence.jpa;

import static org.junit.jupiter.api.Assertions.assertThrows;

import de.ollie.bptracker.core.service.model.RecordingState;
import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RecordingJpaAdapterTest {

	private static final LocalDate DATE_OF_RECORDING = LocalDate.of(2025, 6, 17);
	private static final int DIA_MM_HG = 70;
	private static final int PULSE_PER_MINUTE = 60;
	private static final RecordingState STATE = RecordingState.GREEN;
	private static final int SYS_MM_HG = 130;
	private static final LocalTime TIME_OF_RECORDING = LocalTime.of(23, 31, 42);

	@InjectMocks
	private RecordingJpaAdapter unitUnderTest;

	@Nested
	class create_int_int_int_RecordingState_LocalDate_LocalTime {

		@Test
		void throwsAnException_passingANullValue_asDateOfRecording() {
			assertThrows(
				IllegalArgumentException.class,
				() -> unitUnderTest.create(SYS_MM_HG, DIA_MM_HG, PULSE_PER_MINUTE, STATE, null, TIME_OF_RECORDING)
			);
		}

		@Test
		void throwsAnException_passingAValueLesserThanOne_asDiaMmHg() {
			assertThrows(
				IllegalArgumentException.class,
				() -> unitUnderTest.create(SYS_MM_HG, 0, PULSE_PER_MINUTE, STATE, DATE_OF_RECORDING, TIME_OF_RECORDING)
			);
		}

		@Test
		void throwsAnException_passingAValueLesserThanOne_asPulsePerMinute() {
			assertThrows(
				IllegalArgumentException.class,
				() -> unitUnderTest.create(SYS_MM_HG, DIA_MM_HG, 0, STATE, DATE_OF_RECORDING, TIME_OF_RECORDING)
			);
		}

		@Test
		void throwsAnException_passingANullValue_asState() {
			assertThrows(
				IllegalArgumentException.class,
				() -> unitUnderTest.create(SYS_MM_HG, DIA_MM_HG, PULSE_PER_MINUTE, null, DATE_OF_RECORDING, TIME_OF_RECORDING)
			);
		}

		@Test
		void throwsAnException_passingAValueLesserThanOne_asSysMmHg() {
			assertThrows(
				IllegalArgumentException.class,
				() -> unitUnderTest.create(0, DIA_MM_HG, PULSE_PER_MINUTE, STATE, DATE_OF_RECORDING, TIME_OF_RECORDING)
			);
		}
	}
}
