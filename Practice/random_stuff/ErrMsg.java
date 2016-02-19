package random_stuff;

class ErrorMsg {
	String msg[] = {"Output Error", "Input Error", "Disk Full", "Index Out-of-Bounds"};
	
	String getErrorMsg(int i) {
		if(i >= 1 & i < msg.length)
			return msg[i];
		else
			return "Invalid Error Code";
	}
}

class Err {
	String msg;
	int severity;
	
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}

class ErrInfo {
	String msgs[] = {"Output Error", "Input Error", "Disk Full", "Index Out-of-Bounds"};
	int howbad[] = {3, 3, 2, 4};
	
	Err getErrorInfo(int i) {
		if(i >= 0 & i < msgs.length)
			return new Err(msgs[i], howbad[i]);
		else
			return new Err("Invalid error code", 0);
	}
}

class ErrMsg {
	public static void main(String[] args) {
		ErrorMsg err = new ErrorMsg();
		ErrInfo err1 = new ErrInfo();
		Err e;
		
		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(19));
		
		e = err1.getErrorInfo(2);
		System.out.println(e.msg + " severity: " + e.severity);
		
		e = err1.getErrorInfo(19);
		System.out.println(e.msg + " severity: " + e.severity);
		
		
	}
}
