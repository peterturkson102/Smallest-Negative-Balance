# Smallest-Negative-Balance
 we need to find the balance (Lender - Borrower).
Consider 3 person A,B and C involved in the balancing. we need to find the balance (Lender - Borrower).
Eg:

(i) Borrower: A
Lender:B
Amount:$2

(ii) Borrower: B
Lender:A
Amount:$5

(iii) Borrower: C
Lender:B
Amount:$7

(iv) Borrower: A
Lender:C
Amount:$5

To find A's Balance(Lender-Borrower)
A--> -$2(Borrowed from B) + $5(Lend to B) -$5(Borrowed from C)
So total A's Balance is -2
Simliarly for B's and C's Balance

B--> +$2(Lend to A)-$5(Borrowed from A) +$7(Lend to C)
So B's Total Balance = +$4

C--> -$7(Borrowed from B) + $5(Lend to A)
So C's Total Balance = -$2

Here Maximum negative balance is the Output, if no person has negative balance then return no one is in debts
