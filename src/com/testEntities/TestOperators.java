package com.testEntities;

import com.entities.Operations;

public class TestOperators {

	public static void main(String[] args) {
		Operations op=new Operations(2, 4, 5.67, 10.6, 3.2f, 4.09f);
	System.out.println(op.add());
	System.out.println(op.add(op.getAa(), op.getBb()));
	System.out.println(op.add(op.getAaa(), op.getBbb()));
	}

}
