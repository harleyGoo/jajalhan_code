# DB에서 SELECT한 레코드에 특정 컬럼이 존재하는지 체크
# Dictation 갱신 방법 두 가지
# uuid

import uuid

def check_exists_column(record):
  some_uuid = str(uuid.uuid4())

  update_dic = {
    "SomeId": some_uuid,
    "SomeFlag": True
  }
  if "ColumnName" in record and record["ColumnName"] is not None:
    # Dictation 갱신 방법 No.1
    update_dic["ColumnName"] = record["ColumnName"]

  # Dictation 갱신 방법 No.2
  update_dic.update(
    SomeStatus=1,
    SomeInfo={
      "FirstInfo": "First Information Here",
      "SecondInfo": "Second Information Here",
      "ThirdInfo": False
    }
  )

  print(update_dic)
  return update_dic

record={
  "Temp": 1,
  "Ba": 2,
  "ColumnName": "Yoohoo"
}

check_exists_column(record)
