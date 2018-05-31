#!/bin/bash
for i in $(find . -iname *.scala); do
	if diff /dev/null "$i" | tail -1 | grep '^\\ No newline' > /dev/null; then  echo $i;
	fi;
done
