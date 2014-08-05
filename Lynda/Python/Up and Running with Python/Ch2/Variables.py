__author__ = 'deb'

# Declare a variable and initialize it
f = 0
print(f)

# Re-Declaring the variable works
f = 'abc'
print(f)

#ERROR: different types cannot be combined
#print('string type ' + 123)
print('string type ' + str(123))

# Global Vs local variables in functions
def someFunction():
    #global f
    f = 'def'
    print(f)

someFunction()
print(f)

#del f
print(f)