class MyException(Exception):
  def __init__(self, err_message="", detail_message="", is_my_flg=False):
    self.__err_message = err_message
    self.__detail_message = detail_message
    self.__is_my_flg = is_my_flg

  @property
  def err_message(self):
    return self.__err_message

  @property
  def detail_message(self):
    return self.__detail_message

  @property
  def is_my_flg(self):
    return self.__is_my_flg

# 사용
# response = "NG"
# if response != "OK":
#   raise MyException("Response Error.")
