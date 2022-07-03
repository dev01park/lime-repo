package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import testEnum.enumClass.ColumnGroupEnum;
import testEnum.enumClass.StoreEnum;

public class TestApp {

	@Test
	public void testEnum() {
		for(ColumnGroupEnum data :ColumnGroupEnum.values()) {
			
			Assert.assertEquals(ColumnGroupEnum.TEST_ITEM_CODE, data);
			int ordinal = 0;
			for(StoreEnum storeColumn : data.getValue()) {
				Assert.assertEquals(data.getValue().get(ordinal), storeColumn);
				ordinal++;
				System.out.println(storeColumn.apply());
			}
		}
	}
}
