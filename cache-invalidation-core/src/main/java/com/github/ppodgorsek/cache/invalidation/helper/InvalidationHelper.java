package com.github.ppodgorsek.cache.invalidation.helper;

import com.github.ppodgorsek.cache.invalidation.logger.InvalidationLogger;
import com.github.ppodgorsek.cache.invalidation.model.InvalidationEntry;

/**
 * Helper that invalidates entries.
 *
 * @since 1.0
 * @author Paul Podgorsek
 */
public interface InvalidationHelper<T extends InvalidationEntry> {

	/**
	 * Returns the invalidation logger attached to this helper.
	 *
	 * @return The invalidation logger attached to this helper.
	 */
	InvalidationLogger<T> getInvalidationLogger();

	/**
	 * Invalidates the cache entries read from the invalidation logger.
	 */
	void invalidateEntries();

}
