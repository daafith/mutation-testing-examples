## Installation
First install muter.
```
git clone https://github.com/muter-mutation-testing/muter.git
cd muter
make install
```

### Configure
Not necessary in this example, but in your code it is
```
muter init
```
This generates a JSON file in which you can configure the run.

### Run Muter
```
muter run
```

### Report
Command line, see [docs](https://github.com/muter-mutation-testing/muter#example-test-report) for more info. Or if your run this in XCode, it will show you where the surviving mutants reside.
