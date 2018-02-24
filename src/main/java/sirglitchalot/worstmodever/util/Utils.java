package sirglitchalot.worstmodever.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sirglitchalot.worstmodever.Reference;

public class Utils {

	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MOD_ID);
		}
		return logger;
	}
}
