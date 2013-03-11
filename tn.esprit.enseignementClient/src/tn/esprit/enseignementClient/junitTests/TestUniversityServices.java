package tn.esprit.enseignementClient.junitTests;

import static org.junit.Assert.fail;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Before;
import org.junit.Test;

import services.interfaces.UniversityServicesRemote;

public class TestUniversityServices {
	private Context context;
	private UniversityServicesRemote proxy;

	@Before
	public void setUp() throws Exception {
		context = new InitialContext();
		proxy = (UniversityServicesRemote) context
				.lookup("tn.esprit.enseignement/UniversityServices!services.interfaces.UniversityServicesRemote");
	}

	@Test
	public void testInitDB() {
		
		
	}

}
