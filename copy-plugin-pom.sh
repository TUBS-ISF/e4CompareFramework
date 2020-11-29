#! /bin/bash

for directory in * 
do 
	if [[ -d $directory ]] && [[ ! $directory == ^\.* ]]; then
		echo Processing $directory
		if [[ ! -f $directory/POM.xml ]]; then 
			touch $directory/POM.xml
		fi
	fi
done

