
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
 * This class implements an emplyee which is a person with a name and a salary.
 *
 */
public class Employee {

	private String employeeName;
	private double currentSalary;

    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
    public Employee(String employeeName, double currentSalary) {
		this.employeeName = employeeName;
		this.currentSalary = currentSalary;
    }

    // Accessors that are obvious and have no side effects don't have to have
    // any documentation unless you are creating a library to be used by other
    // people.
    public String getName() {
		return this.employeeName;
    }

    public double getSalary() {
		return this.currentSalary;
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    public void raiseSalary(double byPercent) {
		this.currentSalary *= 1 + (byPercent / 100);
    }
}
