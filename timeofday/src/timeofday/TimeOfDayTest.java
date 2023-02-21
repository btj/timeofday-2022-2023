package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		int ogpStartUur = 8;
		int ogpStartMinuten = 0;
		int ogpEindUur = 10;
		int ogpEindMinuten = 30;
		
		int ogpStartMinutenSindsMiddernacht = ogpStartUur * 60 + ogpStartMinuten;
		int ogpEindMinutenSindsMiddernacht = ogpEindUur * 60 + ogpEindMinuten;
		int ogpDuur = ogpEindMinutenSindsMiddernacht - ogpStartMinutenSindsMiddernacht;
		
		assertEquals(150, ogpDuur);
	}

}
