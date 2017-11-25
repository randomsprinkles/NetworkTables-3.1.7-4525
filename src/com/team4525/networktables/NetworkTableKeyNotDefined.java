package com.team4525.networktables;

import com.team4525.tables.TableKeyNotDefinedException;

/**
 * An exception throw when the lookup a a key-value fails in a {@link NetworkTable}
 * 
 * @deprecated to provide backwards compatability for new api
 * 
 * @author Mitchell
 *
 */
@Deprecated
public class NetworkTableKeyNotDefined extends TableKeyNotDefinedException {

	/**
	 * @param key the key that was not defined in the table
	 */
	public NetworkTableKeyNotDefined(String key) {
		super(key);
	}

}
