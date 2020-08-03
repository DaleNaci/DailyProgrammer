def same_necklace(s1, s2):
    if len(s1) != len(s2):
        return False

    if len(s1) == len(s2) == 0:
        return True

    i = 0
    length = len(s1)

    try:
        j = s2.index(s1[0])
    except:
        return False


    while i < length:
        if j == length:
            j = 0

        if s2[j] != s1[i]:
            return False

        i += 1
        j += 1

    return True

test_cases = [
    ["nicole", "icolen", True],
    ["nicole", "lenico", True],
    ["nicole", "coneli", False],
    ["aabaaaaabaab", "aabaabaabaaa", True],
    ["abc", "cba", False],
    ["xxyyy", "xxxyy", False],
    ["xyxxz", "xxyxz", False],
    ["x", "x", True],
    ["x", "xx", False],
    ["x", "", False],
    ["", "", True]
]

for t in test_cases:
    rtn = same_necklace(t[0], t[1])
    s = f"{t[0]}, {t[1]} -> {rtn}"

    if rtn == t[2]:
        print(f"{s} \u2713")
    else:
        print(f"{s} \u2717")
