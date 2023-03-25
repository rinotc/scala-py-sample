#!/bin/zsh

SCRIPT_DIR=$(dirname $0)

cd "${SCRIPT_DIR}/.."

# 現在のvirtualenv環境を確認する
if [[ "$VIRTUAL_ENV" != "" ]]
then
  echo "Virtualenvがactivateされてます"
else
  echo "Virtualenvが未起動なので起動します"
  # virtualenvのactivateスクリプトを実行する
  source ./venv/bin/activate
fi
