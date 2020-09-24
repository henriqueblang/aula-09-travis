package br.inatel.cdg.aula_09_travis;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TesteAchievment {

	@Mock
	RecebedorMSG rm;
	
	AchievmentMessages achMsg;
	
	private final String MSG = "This is Dark Souls";
	
	@Before
	public void setUp() {
		achMsg = new AchievmentMessages();
	}
	
	@Test
	public void test() {
		AchievmentMessages ach = new AchievmentMessages();
		assertTrue(true);
	}
}