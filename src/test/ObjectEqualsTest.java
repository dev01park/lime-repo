package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

import testVO.EqualsVO_1;

public class ObjectEqualsTest {
	
	@Test
	public void objectEquals() {
		Set<Object> testSet = new HashSet<>();
		int ordinal = 0;
		for(int i = 0; i < 10; i++) {
			EqualsVO_1 vo = new EqualsVO_1();
			vo.setTest1("test1");
			vo.setTest2("test2" );
			vo.setTest3("test3" + ordinal);
			testSet.add(vo);
			ordinal++;
		}
		System.out.println(testSet.size());
		Assert.assertEquals(1, testSet.size());
	}
	
	@Test
	public void streamDistinctTest() {
		int ordinal = 0;
		
		List<EqualsVO_1> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			EqualsVO_1 vo = new EqualsVO_1();
			vo.setTest1("test1");
			vo.setTest2("test2" );
			vo.setTest3("test3" + ordinal);
			list.add(vo);
			ordinal++;
		}
		System.out.println(list.size());
		
		list = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list.size());
		Assert.assertEquals(1, list.size());
	}
}
