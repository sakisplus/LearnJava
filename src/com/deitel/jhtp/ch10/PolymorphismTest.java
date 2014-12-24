package com.deitel.jhtp.ch10;

import com.deitel.jhtp.ch09.BasePlusCommissionEmployee3;
import com.deitel.jhtp.ch09.CommissionEmployee3;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		CommissionEmployee3 comEmp = new CommissionEmployee3("Sue", "Jones", "222-22-2222", 10000, .06);
		BasePlusCommissionEmployee3 bpcomEmp = new BasePlusCommissionEmployee3("Bob", "Lewis", "333-33-3333", 5000, .04, 400);
		
		System.out.printf("%s %s:\n\n%s\n\n",
				"Call CommissionEmployee's toString() with superclass reference",
				"to superclass object", comEmp.toString());
		
		System.out.printf("%s %s:\n\n%s\n\n",
				"Call BasePlusCommissionEmployee's toString() with subclass",
				"reference to subclass object", bpcomEmp.toString());
		
		CommissionEmployee3 comEmp2 = bpcomEmp;
		System.out.printf("%s %s:\n\n%s\n\n",
				"Call BasePlusCommissionEmployee's toString() with superclass",
				"reference to subclass object", comEmp2.toString());
		
	}

}
