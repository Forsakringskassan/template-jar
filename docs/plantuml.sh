#!/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

npx plantuml-cli -overwrite -charset UTF-8 -I $SCRIPT_DIR/*.plantuml