package com.nikhu.poc;

import net.spy.memcached.MemcachedClient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataStore {

	private static final Logger LOG = Logger.getLogger(DataStore.class);
	
	@Autowired
	private MemcachedClient memcachedClient;
	
	public Promotion getPromotion(String mid, String promoCode) {
		LOG.debug("Retrieving promotion to memcache with key: " + mid
				+ promoCode);
		Promotion promotion = (Promotion) memcachedClient.get(mid + promoCode);
		return promotion;
	}

	public void addPromotion(Promotion promotion) {
		LOG.debug("Adding promotion to memcache with key: "
				+ promotion.getMid() + promotion.getPromoCode());
		memcachedClient.add(promotion.getMid() + promotion.getPromoCode(),
				3600, promotion);
	}

}
