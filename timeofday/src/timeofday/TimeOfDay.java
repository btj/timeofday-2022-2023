package timeofday;

// 1. Abstractie definiëren = API definiëren =
//    hoe de klant de abstractie zal gebruiken
//
//    1.1. Rauwe abstractetoestandsruimte definiëren
//         = de getters declareren
//    1.2. Geldige abstractetoestandsruimte definiëren
//         = de abstractetoestandsinvarianten noteren
//    1.3. Constructoren en mutatoren declareren
//         en documenteren
//
// 2. Abstractie implementeren

/**
 * Each instance of this class stores a time of day.
 * 
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {

	public int getHours() { throw new RuntimeException("Not yet implemented"); }
	public int getMinutes() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @throws IllegalArgumentException | !(0 <= hours && hours <= 23)
	 * @throws IllegalArgumentException | !(0 <= minutes && minutes <= 59)
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | 0 <= hours && hours <= 23
	 * @mutates | this
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | 0 <= minutes && minutes <= 59
	 * @mutates | this
	 * @post | getHours() == old(getHours())
	 * @post | getMinutes() == minutes
	 */
	public void setMinutes(int minutes) { throw new RuntimeException("Not yet implemented"); }
	
}
