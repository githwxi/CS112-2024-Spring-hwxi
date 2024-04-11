
def tally(x):
    return ((x + tally(x-1)) if (x > 0) else 1);

print("tally(100) = ", tally(100))
print("tally(1000000) = ", tally(1000000))
