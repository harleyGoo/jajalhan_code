something=str(input("something:")).upper()
some_str_list = ['Abc', 'Bcd', 'Cde', 'Def', 'Efg']
if something in [each_str.upper() for each_str in some_str_list]:
  print("Matched.")
else:
  print("Plz check again.")
