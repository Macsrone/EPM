package Assignment14.q8;

public class Value {

	int parameter;
	boolean flag=false;
	boolean flagCons=false;
	
	public Value(int parameter) {
		this.parameter = parameter;
		flagCons=true;
	}

	public Value() {

	}

	public void setVal(int parameter) {
		this.parameter = parameter;
		flag=true;
	}
	
	public boolean wasModified() {
		return flag;
		
	}

	public int getVal() {
		if (flag || flagCons) {
			return parameter;
		}else {
			return 0;
		}
		
	}

	
	
	
}
