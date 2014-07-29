__author__ = 'deb'

try:
    fh = open("xlines.txt")
    for line in fh.readlines():
        print(line, end = '')
except :
# Can be except IOError as e:
    print("something bad happened")
    # can be print("something bad happened ({})".format(e))
print("after badness")