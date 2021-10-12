#!/bin/bash

###############################################################
# 많은 수의 더미파일을 작성하는 쉘스크립트
#
# 사용법:
#    ./generate_dummy.sh {디렉토리명} {시작숫자} {종료숫자}
# 예) ./generate_dummy.sh 001 1 10000
#     ⇒ 001이라는 디렉토리 안에 10000개의 더미파일을 작성한다.
###############################################################


_dir=$1
_start=$2
_end=$3

dd if=/dev/zero of=dummy bs=1k count=1
mkdir $_dir

for i in `seq $_start $_end`
do
cp dummy $_dir/dummy$i
done

