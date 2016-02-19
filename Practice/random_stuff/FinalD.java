package random_stuff;

class ErrorMsg1 {
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	
	String msgs[] = {
			"Output Error", "Input Error", "Disk Error", "Index Out-of-Bound"
	};
	
	String getErrMsg(int i) {
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Invalid Error Code";
	}
}

class FinalD {
	public static void main(String[] args) {
		ErrorMsg1 err = new ErrorMsg1();
		
		System.out.println(err.getErrMsg(err.OUTERR));
	}
}
