package de.ollie.bptracker.util;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CheckTest {

	@Nested
	class constructor {

		@Test
		void throwsAnException_whenCalled() {
			assertThrows(UnsupportedOperationException.class, () -> new Check());
		}
	}
}
