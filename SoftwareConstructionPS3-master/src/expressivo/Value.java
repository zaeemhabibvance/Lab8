package expressivo;

public class Value implements Expression{
	private double num=0;
	
	private void checkRep() {
        assert Double.isFinite(num);
        assert num>=0;
        assert num <= Double.MAX_VALUE;
    }
	
	public Value(double num) {
        this.num = num;
        checkRep();
    }

	@Override 
	public String toString() {
	    String n = Double.toString(num);
	    checkRep();
	    return n;
	}
	
	@Override 
	public int hashCode() {
	    checkRep();
	    return this.toString().hashCode();
	}
}