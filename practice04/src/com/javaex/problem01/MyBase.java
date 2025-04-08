package com.javaex.problem01;

public class MyBase extends Base{

    //코드작성
    //@Override
/*    public void service(String state) {
    	// TODO Auto-generated method stub
    	if(state.equals("낮")) {
    		System.out.println("낮에는 열심히 일하자");
    	}else if(state.equals("밤")) {
    		super.night();
    	}else {
    		System.out.println("오후도 낮과 마찬가지로 열심히 일하자");
    	}
    }*/
    
	public void service(String state) {

	    if (state.equals("낮")) {
	      day();
	    } else if (state.equals("오후")) {
	      afternoon();
	    } else {
	      night();
	    }
	  }

	  public void afternoon() {
	    System.out.println("오후도 낮과 마찬가지로 일해야 합니다");
	  }

	  public void day() {
	    System.out.println("낮에는 열심히 일하자");
	  }
}
