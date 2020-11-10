// Prints the table of the given number
print "Which table:"
int num = System.in.newReader().readLine() as Integer
for(int ctr = 1; ctr <= 10; ctr++) {
	int result = num * ctr
	println "$num * $ctr = $result"
}

