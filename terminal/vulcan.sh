#!/bin/bash
mkdir alpha_quadrant
cd alpha_quadrant
touch {betazed,earth,vulcan}
echo "Before: "
ls -lh
echo "Live long and prosper" > vulcan
echo "After: "
ls -lh
echo "So long and thaks for all the fish!"
