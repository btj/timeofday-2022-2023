package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay ogpStart = new TimeOfDay(8, 0);
		TimeOfDay ogpEind = new TimeOfDay(10, 30);
		
		int ogpStartMinutenSindsMiddernacht = ogpStart.getHours() * 60 + ogpStart.getMinutes();
		int ogpEindMinutenSindsMiddernacht = ogpEind.getHours() * 60 + ogpEind.getMinutes();
		int ogpDuur = ogpEindMinutenSindsMiddernacht - ogpStartMinutenSindsMiddernacht;
		
		assertEquals(150, ogpDuur);
	}

}
