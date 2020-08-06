package testNGFramework;

import org.testng.annotations.Test;

public class GroupingConcept {
	@Test (groups="X")
	public void f1() {
		System.out.println("printf1");
	}
	@Test (groups="X")
	public void f2() {
		System.out.println("printf2");
	}
	@Test (groups="Y")
	public void f3() {
		System.out.println("printf3");
	}
	@Test (groups="Y")
	public void f4() {
		System.out.println("printf4");
	}

}
