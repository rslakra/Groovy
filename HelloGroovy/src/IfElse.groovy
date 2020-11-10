// list items
List items = ["Computer", "Monitor","Printer", "Keyboard", "Mouse", "Desktop", "Laptop"]
List evenItems = []
List oddItems = []
int ctr = 0
while(ctr < items.size) {
	int size = items[ctr].size()
	if (size % 2 == 0) {
		evenItems.add(items[ctr])
	} else {
		oddItems.add(items[ctr])
	}
	ctr++
}

println "Total ${evenItems.size} Even Items:${evenItems}"
println "Total ${oddItems.size} Odd Items:${oddItems}"
