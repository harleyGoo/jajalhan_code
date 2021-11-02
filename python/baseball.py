from random import *


def baseBall():
  n = str(423)
  co = 0  
  s = 0
  b = 0
  while s != 3:
    a = input('세자리의 숫자를 입력해주세요 : ')
    if len(a) != 3:
      print('세자리의 숫자만 입력가능합니다.')
    else:
      co += 1
      s = 0
      b = 0

      for i in range(0,3):
        for o in range(0,3):
          if (a[i] == n[o] and i==o) :
            s += 1
          elif (a[i] == n[o] and i!=o) :
            b += 1
      if s == 0 and b ==0 :
        print('out')
      else:
        print ('사용자 입력숫자 : %s, %s Strike, %s Ball'%(a,s,b))

      
  print('You win this game. You\'ve played %s times'%co)

baseBall()
