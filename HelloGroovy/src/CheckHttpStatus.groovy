// Check Http Status Code

// you can define with 'def' keyword too
print "Enter http status code:"
def httpStatus = System.in.newReader().readLine() as Integer

switch(httpStatus) {
	case 200..299:
		println "Success"
		break
	case 300..399:
		println "Redirct"
		break
	case 400..499:
		println "Client Error"
		break
	case 500..599:
		println "Server Error"
		break
	default:
		// invalid status
		println "Unsupported Http Status"
		break

}


