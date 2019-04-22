package expressivo;

public class Multiplication implements Expression {
	
	private final Expression left;
	private final Expression right;
	
	
	// Abstraction Function
    //   represents an addition expression made up of
    //   two subexpressions
    //
    // Representation Invariant
    //   The left and right are non-null immutable expressions
    //
    // Safety From Exposure
    //   - All fields are private and final
    //   - left and right are immutable
    //   - Addition shares its rep with other implementations
    //     but they do not modify it
    
	private void checkRep() {
		assert left!=null;
		assert right !=null;
	}
	
	public Multiplication(Expression left, Expression right) {
		this.left=left;
		this.right=right;
		checkRep();
	}
	
	public String toString() {
		checkRep();
		return left.toString()+"x"+right.toString();
	}
	
	public boolean equals(Expression e) {
		checkRep();
		return (e.toString().equals(this.toString()));
	}
	
	public int hashCode() {
		checkRep();
		return this.toString().hashCode();
	}

}
