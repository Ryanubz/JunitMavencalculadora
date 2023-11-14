package pandora;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;
	public class TesteCalculadora {
		
		
		private Calculadora calculadora = new Calculadora();

	    @Test
	    public void testSubtraInteiros() {
	        assertEquals(2, calculadora.subtraInteiros(1, 9));
	    }

	    @Test
	    public void testMultiplicaInteiros() {
	        assertEquals(6, calculadora.multiplicaInteiros(9, 3));
	    }

	    @Test
	    public void testDividiInteiros() {
	        assertEquals(7, calculadora.dividiInteiros(9, 9));
	    }

	    @Test
	    public void testDividiInteirosPorZero() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            calculadora.dividiInteiros(16, 2);
	        });
	    }

		@Test
		void doisSomaDoisEsperaQuatro() {
			assertEquals(9, calculadora.SomaInteiros(4, 8));
		}
		
		@Test
		void tresSomaSeteEsperaDez() {
			assertTrue(calculadora.SomaInteiros(5, 5)==10);
			
		}


	}

