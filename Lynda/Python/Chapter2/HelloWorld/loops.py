__author__ = 'deb'

# simple fibonacci series
# the sum of two elements defines the next set
a, b = 0, 1
while b < 50:
    print(b)
    a, b = b, a + b
print("Done")

# read the lines from a file
fh = open("lines.txt")
for line in fh.readlines():
    print(line)
    #print(line, end='') WILL REMOVE THE ADDED \n



