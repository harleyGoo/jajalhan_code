:: 로컬에 파일로 데이터준비 후 DynamoDB 갱신

:: DELETE
aws dynamodb batch-write-item --request-items file://filepath/sample_DELETE.json

:: INSERT
aws dynamodb put-item --table-name dummy-table --item file://filepath/sample.json
