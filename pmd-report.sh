#!/usr/bin/env sh

pwd
mvn pmd:pmd
cat ./target/pmd.txt