# Java Exception Handling


printStackTrace() - prints name of the exception, description and complete stack trace
toString() - prints name of the exception and description
getMessage() - prints the description of the exception only.

Order of catch blocks.
Multi-catch statements

Exception heirarchy

Checked vs Unchecked? When to use what?
Write custom exceptions

Reading the stack trace

Questions:
NoClassDefError vs ClassNotFoundException
ExceptionInInitializerError - if anny error occurred while initializing the static variables or executing static blocks during class loading, this error would occur. ExceptionInInitializerError extends LinkageError extends Error
IllegalArgumentException - calling a method with invalid input values
