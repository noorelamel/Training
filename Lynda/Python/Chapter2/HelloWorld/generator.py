__author__ = 'deb'

def isprime(n):
    if n == 1:
        return False
    for x in range(2, n):
        if n % x == 0:
            return False

    else:
        return True

# Generator function
def primes(n = 1):
    while(True):
        if isprime(n): yield n  # yield is like return if isprime returns true
        n += 1                  # this yield returns an iterator object

for n in primes():
    if n > 100: break
    print(n)

