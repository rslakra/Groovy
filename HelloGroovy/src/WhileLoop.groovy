// list items
List items = ["Computer", "Monitor", "Keyboard", "Mouse", "Desktop", "Laptop"]
int ctr = 0
int totalChars = 0;
while(ctr < items.size) {
	println "Length of [${items[ctr]}] = ${items[ctr].size()}"
	totalChars += items[ctr].size()
	println "Total Chars:$totalChars"
	ctr++
}
