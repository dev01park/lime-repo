package testEnum.enumClass;

import java.util.Arrays;
import java.util.List;

public enum ColumnGroupEnum {
	
	TEST_ITEM_CODE("item_code", Arrays.asList(BizestColumnEnum.ITEM_CODE, Shop_29CM.PRODUCT_CODE));

	String name;
	List<StoreEnum> list;
	
	ColumnGroupEnum(String name, List<StoreEnum> list) {
		this.name = name;
		this.list = list;
	}
	
	public List<StoreEnum> getValue() {
		return list;
	}
	


}
