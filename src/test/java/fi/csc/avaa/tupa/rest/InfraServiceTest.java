package fi.csc.avaa.tupa.rest;

import org.junit.Test;

import java.util.*;

import static fi.csc.avaa.tupa.rest.InfraService.createLegacyURN;
import static fi.csc.avaa.tupa.rest.InfraService.createURN;
import static org.junit.Assert.*;

public class InfraServiceTest {

	@Test
	public void testCreateLegacyURN() throws Exception {

		int id = 1;
		Date date = new GregorianCalendar(2016, Calendar.AUGUST, 6).getTime();
		String correctResult = "urn:nbn:fi:csc-infras-201608061";
		
		assertEquals(correctResult, createLegacyURN(id, date));
		
	}

	@Test
	public void testCreateURN() throws Exception {

		int id = 1;
		Date date = new GregorianCalendar(2016, Calendar.AUGUST, 6).getTime();
		String correctResult = "urn:nbn:fi:research-infras-201608061";

		assertEquals(correctResult, createURN(id, date));

	}

}