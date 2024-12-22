# Makefile for TruffleVim project

# Default target
all: build

# Target to clean the project
clean:
	mvn clean

# Target to compile the project
build:
	mvn compile

# Target to run tests
test:
	mvn test

# Target to clean, build, and test the project
rebuild: clean build test

# Phony targets
.PHONY: all clean build test rebuild
