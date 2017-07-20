#!/bin/bash

mkdir /tmp/my_boot && cd /tmp/my_boot
dmesg | grep boot > original
sort -r original > reverse
tail -n +2 original | tee > original2
cat original2 > original
ls -lh .
echo "Bok!"
rm -rf /tmp/my_boot
