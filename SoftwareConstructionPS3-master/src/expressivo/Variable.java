package expressivo;

public class Variable implements Expression {
    private final String id;
    
    private void checkRep() {
        assert id != null;
        assert id.length() > 0;
        assert id.matches("[a-z][A-Z]*");
    }
    
    public boolean equals(Expression e){
    	return this.toString().equals(e.toString());
    }
    
    public Variable(String id) {
        this.id = id;
        checkRep();
    }
    
    @Override public String toString() {
        return this.id;
    }

    @Override public int hashCode() {
        return this.id.hashCode();
    }
}