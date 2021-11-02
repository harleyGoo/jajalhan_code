a = int(input("숫자를 입력하시오:"))
b = int(input("숫자를 입력하시오:"))

def btwsum(a,b):
    if a == b:
      return b
    elif a < b:
      return a + btwsum(a+1, b)
    else:
      return a + btwsum(a-1, b)

print(btwsum(a,b))