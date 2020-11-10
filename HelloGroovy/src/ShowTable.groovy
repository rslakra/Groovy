// Prints the table of the given number
print "Which table:"
int num = System.in.newReader().readLine() as Integer
int ctr = 1
while(ctr <= 10) {
	int result = num * ctr
	println "$num * $ctr = $result"
	ctr += 1
}

