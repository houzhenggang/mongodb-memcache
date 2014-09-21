package com.nikhu.poc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-config.xml" })
public class DataStoreTest {

	@Autowired
	private DataStore dataStore;

	@Test
	public void testAddPromotion() {
		Promotion promotion = new Promotion();
		promotion.setMid("MID-1");
		promotion.setPromoCode("PROMO-1");
		promotion.setMaximumTotalUses(100);
		dataStore.addPromotion(promotion);
	}

	@Test
	public void testGetPromotion() {
		Promotion promotion = dataStore.getPromotion("MID-1", "PROMO-1");
		assertNotNull(promotion);
	}

}
