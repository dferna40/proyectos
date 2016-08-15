package pruebaspring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pruebaspring.controller.HomeController;

public class HomeControllerTest {
	@Test
	public void testHomePage() throws Exception {
		HomeController controller = new HomeController();
		assertEquals("index", controller.home());
	}
}
