#!/usr/bin/groovy

import com.kpit.pduapi.Variant
import static com.kpit.pduapi.Utilities.*

def exampleMethod() {
    echo "hello exempul"
    echo "${WORKSPACE}"
    dir(path: "${WORKSPACE}")
    {
    gitClone
        {
            url = 'ssh://git@git.diagnostics.kpit.com:7999/pduapi/pdu-api-test.git'
            targetDir = 'pdu-api-test'
        }
    }
}

def otherExampleMethod() {
    echo "Hello other"
}
return this

