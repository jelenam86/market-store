# market-store
A market model store

# Assignment

A market store offers to their clients three different types of discount cards: bronze, silver and gold. Each card stores information about its owner, the turnover for the previous month and the initial discount rate. With each card you can calculate the discount of the current purchase. In general this is done using the formula: valueOfPurchase * discountRate.

The bronze card comes with no discount rate if the turnover for the previous month is below $100. If it is between $100 and $300, the discount rate is 1%. And if it is above $300, the rate is 2.5%.
<br>The silver card comes with an initial discount rate of 2%. In case, the turnover is above $300, the rate is 3.5%.
<br>The gold card comes with an initial discount rate of 2%. The discount rate grows 1% for each $100 from the turnover, capping at 10%.

Your task is:
<ul>
<li>to write an object-oriented model of this market store system;
<li>to create a class that contains method(s) that output the discount rate, the discount and the total purchase value;
<li>in your application entry point:
<ul>
<li>create instances with sample data as shown in [Example outputs] (https://github.com/jelenam86/market-store/blob/master/README.md#example-output) section;
<li>invoke method(s) to print the required information.
</ul></ul>

# Example output
<b>Bronze:</b>
<br>a. Mock data: turnover $0, purchase value $150;
<br>b. Output:

Purchase value: $150.00
<br>Discount rate: 0.0%
<br>Discount: $0.00
<br>Total: $150.00

<b>Silver:</b>
<br>a. Mock data: turnover $600, purchase value $850;
<br>b. Output:

Purchase value: $850.00
<br>Discount rate: 3.5%
<br>Discount: $29.75
<br>Total: $820.25

<b>Gold:</b>
<br>a. Mock data: turnover $1500, purchase value $1300;
<br>b. Output:

Purchase value: $1300.00
<br>Discount rate: 10.0%
<br>Discount: $130.00
<br>Total: $1170.00
