#!/bin/zsh
# 現在のvirtualenv環境を確認する
#if [[ "$VIRTUAL_ENV" != "" ]]
#then
#  echo "Virtualenvがactivateされてます"
#else
#  echo "Virtualenvが未起動なので起動します"
#  # virtualenvのactivateスクリプトを実行する
#  source ./venv/bin/activate
#fi

SCRIPT_DIR=$(dirname $0)

export SCALAPY_PYTHON_PROGRAMNAME="${SCRIPT_DIR}/../venv/bin/python"
echo ${SCALAPY_PYTHON_PROGRAMNAME}
sbt run
