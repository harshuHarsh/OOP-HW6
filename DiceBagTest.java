package hw6;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DiceBagTest {
	DiceBag diceBag;
	@BeforeEach
	void setUp() throws Exception {
		diceBag =new DiceBag();
	}

	@AfterEach
	void tearDown() throws Exception {
		diceBag=null;
		
			}

	@Test
	void testAddToken() {
		
		int sizeOfBagbefore=diceBag.bag.size();//0
		diceBag.addToken(new OrderDie("Tom", "red"));
		int sizeOfBagAfter=diceBag.bag.size();//1
		assertEquals(sizeOfBagbefore+1,sizeOfBagAfter);	
		
	}

	@Test
	void testDrawToken() throws Exception{
		Token t = new OrderDie("Tom", "red");
		Token t1;
		//DiceBag diceBag1=Mockito.mock(DiceBag.class);
		diceBag.addToken(t);
		diceBag.addToken(t);
		int bagSize=diceBag.bag.size();
		t1=diceBag.drawToken();
		int bagSize1=diceBag.bag.size();
		assertEquals(bagSize-1,bagSize1);
	}

	@Test
	void testToString() {
		Token t = new OrderDie("Tom", "red");
		diceBag.addToken(t);
		String ret = " Dice left: " + diceBag.bag.size() + "\n"+t.toString()+"\n";
		assertEquals(ret,diceBag.toString());
	}

}
