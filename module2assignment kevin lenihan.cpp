/*
 * Calculator.cpp
 *
 *  Date: [May 19 2024]
 *  Author: [Kevin Lenihan]
 */

#include <iostream>

using namespace std;

int main()
{
	int op1, op2;           //initialize all variables 
	char operation;
	char answer = 'y';
	while (answer == 'y')
	{
		cout << "Enter expression" << endl;     //simple output to prompt user
		cin >> op1 >> operation >> op2;         // gathers input from user
		
		switch (operation) {                    //switch case allows for an easy to read program and minimizes errors
		    case '+' :
		        cout << op1 << " + " << op2 << " = " << op1 + op2 << endl; // equation for addition
		        break;
	        case '-' :
	            cout << op1 << " - " << op2 << " = " << op1 - op2 << endl; // equation for subtraction
	            break;
		    case '*' :
		        cout << op1 << " * " << op2 << " = " << op1 * op2 << endl; // equation for multiplication
		        break;
		    case '/' :
		        if (op2 != 0) {
		            cout << op1 << " / " << op2 << " = " << op1 / op2 << endl; // equation for division, also checks that 0 is not being used as the denominator
		            break;
		        }
		        else {
		            cout << "Division by zero, enter a different number.";
		        }
		  default:
		    cout << "Unknown input, please use one of the following +, -, *, or /" << endl; // verifies the correct operator is used
        }
		cout << "Do you wish to evaluate another expression? (y/n)" << endl; // allows the user to exit the program or restart the loop
		cin >> answer;
	}
    return 0;
}