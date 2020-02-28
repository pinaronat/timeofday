package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	


	@Test
	void test() {
		TimeOfDay myTime = new TimeOfDay();
		myTime.setHours(24);
		myTime.setMinutes(45);
		assert myTime.getHours() == 24;
		assert myTime.getMinutes() == 45;
	}

}
