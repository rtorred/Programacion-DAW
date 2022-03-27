package grupoa;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SumaNumerosTest {
	
	
	private int num;
	private int result;

	public SumaNumerosTest(int num, int result) {
		super();
		this.num = num;
		this.result = result;
	}

	@Parameters
	public static Collection<Object[]> numerosPares() {
		final List<Object[]> lista =new ArrayList<Object[]>();
		lista.add(new Object[] {0,0});
		lista.add(new Object[] {1,0});
		lista.add(new Object[] {8,20});
		return lista;
	}

	@Test
	public void testSumaNumeros() {
		SumaNumeros sn = new SumaNumeros();
		int res = sn.sumaNumeros(num);
		assertEquals(result, res);
	}

}
