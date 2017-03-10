package com.gs.server

class KKMultiServer {

	static void main(String... args) {
		if (args.length != 1) {
			System.err.println("Usage: groovy KKMultiServer <port number>")
        	System.exit(1)
		}

		def portNumber = Integer.parseInt(args[0])

		def serverSocket = new ServerSocket(portNumber)

		while(true) {
			serverSocket.accept(true, { socket ->
					socket.withStreams { input, output ->
						KnockKnockProtocol kkp = new KnockKnockProtocol()

						def outputLine = kkp.processInput(null)
						output << outputLine+"\n"

						def reader = input.newReader()
						def inputLine 

						while ( ( inputLine = reader.readLine() ) ) {
							outputLine = kkp.processInput(inputLine)
							output << outputLine+"\n"

							if (outputLine.equals("Bye"))
                    			break
						}
					}
				}) 
		}
	}
	
}