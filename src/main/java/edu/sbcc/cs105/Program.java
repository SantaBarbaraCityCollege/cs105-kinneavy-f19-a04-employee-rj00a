/**
 * CS 105 Theory and Practice I
 * CRN: 38066
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Ryan Johnson
 */
package edu.sbcc.cs105;

/**
 * This class provides first level testing the Employee object.
 *
 */
public class Program {

    /**
     * Create an employee and test that the proper name has been created. Test
     * the initial salary amount and then give the employee a raise. Then check
     * to make sure the salary matches the raised salary.
     * 
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
		Employee harry = new Employee("Harry", 10000);

		harry.raiseSalary(10); // Harry gets a 10% raise.
		
		System.out.println("Harry's current salary is " + harry.getSalary() + ".");

		// Harry gets promoted to the CEO of Harry Co.
		harry.raiseSalary(1000);

		System.out.println("Harry is now the CEO. His new salary is " + harry.getSalary() + ".");
    }
}
