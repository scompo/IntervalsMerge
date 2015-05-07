#!/usr/bin/sh

pwd
mvn -X -e pmd:pmd
cat ./target/pmd.txt