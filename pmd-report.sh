#!/bin/bash

pwd
mvn pmd:pmd
cat ./target/pmd.txt