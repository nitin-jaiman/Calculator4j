# Calculator4j

### How to get this library
## Step 1 - Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ## Step 2 - Add the dependency
  
  	dependencies {
	        implementation 'com.github.nitin-jaiman:Calculator4j:1.0'
	}


### What is this library

### Input -> An arithmetic expression (String)

Example

1+{3+5*6+[(7-2)/10]}+100.5

### Output -> Result of arithmetic expression (BigDecimal)

Example

135

### How it works
It converts Infix arithmetic expression to postfix and then resolve postfix to evaluate result.

### Upcoming features
1. Support of trignometric functions.
2. Support of degree/radion (configurable).

### Feel free to get in touch and contribute to this library.
