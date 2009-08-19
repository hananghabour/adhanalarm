package islam.adhanalarm;

import net.sourceforge.jitl.Method;
import net.sourceforge.jitl.Rounding;

public class CONSTANT {
	protected static final boolean DEBUG = false;
	
	protected static final short FAJR = 0, SUNRISE = 1, DHUHR = 2, ASR = 3, MAGHRIB = 4, ISHAA = 5, NEXT_FAJR = 6; // Notification Times
	protected static final short DEFAULT_NOTIFICATION = 0, RECITE_ADHAN = 1, NO_NOTIFICATIONS = 2; // Notification Methods
	protected static final short NO_EXTRA_ALERTS = 0, ALERT_SUNRISE = 1; // Extra Alerts
	
	protected static final Method[] CALCULATION_METHODS = new Method[]{Method.EGYPT_SURVEY, Method.KARACHI_SHAF, Method.KARACHI_HANAF, Method.NORTH_AMERICA, Method.MUSLIM_LEAGUE, Method.UMM_ALQURRA, Method.FIXED_ISHAA};
	protected static final Rounding[] ROUNDING_TYPES = new Rounding[]{Rounding.NONE, Rounding.NORMAL, Rounding.SPECIAL, Rounding.AGRESSIVE};
	
	private CONSTANT() {
		// Private constructor to enforce un-instantiability.
	}
}