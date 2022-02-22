import re

text = "abcdefg1234fghij"

result = re.sub(r'[1-9]', "0", text)
print(result)  # abcdefg0000fghij

result = re.sub(r'[1-9]', "0", text)


text2 = "문의사항이 있으면 032-232-3245 으로 연락주시기 바랍니다."
 
regex = re.compile(r'\d\d\d-\d\d\d-\d\d\d\d')
matchobj = regex.search(text2)
phonenumber = matchobj.group()
print(phonenumber)  # 032-232-3245


# 참고사이트
# https://note.nkmk.me/python-str-replace-translate-re-sub/
# http://pythonstudy.xyz/python/article/401-%EC%A0%95%EA%B7%9C-%ED%91%9C%ED%98%84%EC%8B%9D-Regex
