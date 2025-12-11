#!/bin/bash
# Task Prioritizer Test Runner
echo "Running Task Prioritizer tests..."

# Make sure we're in the right directory
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
PROJECT_DIR="${SCRIPT_DIR%/tests}"

cd "$PROJECT_DIR" || exit 1

# Run tests and capture exit code
mvn -q -f "$PROJECT_DIR/pom.xml" -Dtest=TaskPrioritizerTest test
EXIT_CODE=$?

if [ $EXIT_CODE -eq 0 ]; then
    echo "✅ Task Prioritizer tests passed"
    exit 0
else
    echo "❌ Task Prioritizer tests failed"
    exit 1
fi
