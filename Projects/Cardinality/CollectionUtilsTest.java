import org.junit.Assert;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Adam
 *
 */
public class CollectionUtilsTest
{

	@Test
	public void test()
	{
		int count = CollectionUtils.cardinality(null, null);
		Assert.assertEquals(count,0);
	}

}
