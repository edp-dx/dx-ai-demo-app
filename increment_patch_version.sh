#!/bin/bash
# This script automates the incrementing of the PATCH version in the pom.xml file.

current_version=$(grep -oPm1 "(?<=<version>)[^<]+" pom.xml)
IFS='.' read -ra VERSION <<< "$current_version"
new_patch_version=$((VERSION[2]+1))
new_version="${VERSION[0]}.${VERSION[1]}.$new_patch_version-SNAPSHOT"

mvn versions:set -DnewVersion=$new_version
mvn versions:commit

echo "Version updated to $new_version"
