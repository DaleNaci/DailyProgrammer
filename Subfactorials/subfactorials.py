import sys
def f(n):return(0,1)[n<1] if n<2 else(n-1)*(f(n-1)+f(n-2))
print(f(int(sys.argv[1])))