#!/bin/bash

#######################################################
# generate_dummy.sh을 자동으로 실행하기 위한 쉘스크립트
#
# 사용법:
#   ./auto_generate_dummy.sh
# 현재 내용은 50000개의 더미파일을 작성한다.
#######################################################

./generate_dummy.sh 001 1 10000 &
./generate_dummy.sh 002 1 10000 &
./generate_dummy.sh 003 1 10000 &
./generate_dummy.sh 004 1 10000 &
./generate_dummy.sh 005 1 10000 &

